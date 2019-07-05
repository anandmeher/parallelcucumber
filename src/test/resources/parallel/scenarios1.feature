Feature: TBM Login 2

  Scenario: Navigate to TBM Portal
    Given Navigate to URL 'http://cnamdev-sms-tbm-web02.de.neustar.com/'

  Scenario: Login to TBM portal
    Given Navigate to URL 'http://cnamdev-sms-tbm-web02.de.neustar.com/'
    And Enter username 'cnamadmin@tnsi.com'
    And Enter password 'Welc0me1!'
    When Click on Login Button
    Then Verify Dashboard is displayed