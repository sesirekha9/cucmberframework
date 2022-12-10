Feature: Test the skillrary App
1) Valid Case
2) Invalid Case
Background:
@PositiveTesting
Scenario Outline: To test login with multiple data
Given I should go to login page
When Enter Username "<user>"
And Enter Password "<pass>"
And Click on the loginbutton
Then i should see the username as "<username>"
Examples:
|user|pass|username|
|user|user|harry harry|
|user|user|harry harry|
|admin|admin|SkillRary Admin|
@NegativeTesting
Scenario: To Test the Login with invalid Credentials
Given I should go to login page
When Enter Username "sesi"
And Enter Password "sesi123"
And Click on the loginbutton
Then i should see the "Register"