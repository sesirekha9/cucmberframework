Feature:Test Skillrary
1) Valid cases
2) Invalid cases
@PositiveTesting
Scenario: check for vaild data
Given I should go to login page
When enter username "admin"
And Enter password "admin"
And Click on the login button
Then Ishould see the username as "SkillRary Admin"
@NegativeTesting
Scenario:  check for invaild data
Given I should go to login page
When  enter username "sesi"
And Enter password "admin123"
And Click on the login button
Then Ishould see the username as "SkillRary Admin"