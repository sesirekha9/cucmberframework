Feature: Test demoapp 
Scenario: To test login functionality
Given I should go to the login page  
And Enter the username "user"
And Enter the password "user"
And Click on the login button
And click on the dropdown button
And I should see the username as "harry harry"
Then Click on the sign out button