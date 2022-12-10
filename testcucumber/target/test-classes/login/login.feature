Feature:Test OrangeHRM
1) Valid cases
2) Invalid cases
@PositiveTesting
Scenario: To test login functionality
Given to go to login page
When enter username "Admin"
And Enter password "admin123"
And Click on the login button
Then Ishould see the username as "Paul Collings"
@NegativeTesting
Scenario: To test login functionality
When  enter username "sesi"
And Enter password "admin123"
And Click on the login button
Then Ishould see the username as "Paul Collings"










   

  