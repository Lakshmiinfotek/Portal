Feature: feature of a login test functionality and get a course
Scenario: test with valid credentials
Given I am on the home page of "https://training.qaonlinetraining.com/"
Then I click on the "login" button
And I type the Username = "Laksmi" and password="7051234567"
Then I click on "login" 
Then I am on the mainpage
And I will click on "database" button
Then i am on the database page