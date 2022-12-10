Feature:Test Skillrary
1) Valid cases
2) Invalid cases
Background:
@PositiveTesting
Scenario Outline: To test login with multiple data
Given I should go to login page
When Enter Username "<user>"
And Enter Password "<pass>"
And Click on the loginbutton
Then i should see the username as "<username>"
Examples:
|user|pass|
|user|user|
|admin|admin|
@NegativeTesting
Scenario:  check the login functionality with invaild data
Given I should go to login page
When Enter Username "<user>"
And Enter Password "<pass>"
And Click on the loginbutton
Then i should see the username as "<username>"
Examples:
|user|pass|
|user@|user@|
