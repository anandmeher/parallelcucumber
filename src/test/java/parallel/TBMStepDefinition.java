package parallel;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TBMStepDefinition extends TestBase {

//    public TBMStepDefinition(MutableCapabilities capabilities) {
//        super(capabilities);
//    }

//    TBMStepDefinition(){
//        super(new ChromeOptions());
//    }

    @Given("^Navigate to URL '(.+)'$")
    public void navigate_to_url_(String url) {
        System.out.format("Thread ID - %2d", Thread.currentThread().getId());
        System.out.println(System.getProperty("name"));
        WebDriver webDriver = getDriver();
        webDriver.navigate().to(url);
        Assert.assertEquals("TBM Portal", webDriver.getTitle());
    }

    @Given("^Enter username '(.+)'$")
    public void enter_username_(String username) {
        WebDriver webDriver = getDriver();
        webDriver.findElement(By.id("userName")).sendKeys(username);
    }

    @When("^Click on Login Button$")
    public void click_on_login_button() {
        WebDriver webDriver = getDriver();
        webDriver.findElement(By.id("loginSubmit")).click();
    }

    @Then("^Verify Dashboard is displayed$")
    public void verify_dashboard_is_displayed() {
        WebDriver webDriver = getDriver();
        Assert.assertEquals("TBM Portal", webDriver.getTitle());
    }

    @And("^Enter password '(.+)'$")
    public void enter_password_(String password) {
        WebDriver webDriver = getDriver();
        webDriver.findElement(By.id("password")).sendKeys(password);
    }

}
