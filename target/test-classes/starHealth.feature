Feature: Phase End project

Scenario: Star health home page test

Given User open the chrome browser and starhealth application
When User  waits for the Welcome to Star Health pop-up and closes it
Then  validates the Star Health home page title using a JUnit assertion 
Then  clicks on the Buy Now button 
And User enters following details
| URL | FullName | PhNo | PIN | OptionPlan |
| admin | admin@123 | 353453 | 12345 | plan1 |
| maya | admin@123 | 53564 | 12356 | plan2 |
And  User clicks on I need health insurance from the drop-down menu and select plan
Then  User click on the Plan for My Family page 
And Validate the user mobile number
And User clicks on the Star Health logo 
And Close all the browsers