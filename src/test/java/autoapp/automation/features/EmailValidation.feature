Feature: Verification of email address

  Scenario: Verify error is shown when email id is in incorrect 
    Given Automation practice application is opened
    When I click sign in
    And I create account with emailid "wrongusername@domainname"
    Then I should see Invalid email address message
    
