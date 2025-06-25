#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation

Feature: Validating user login flow

@Create_Account
Scenario: Creating User Account on Application under Test
Given user should open application
When user verify title of Application
When user  click on creteAccount
When user enter FirstName
When user enter lastName
When user enter email address
When user enter password
When user confirm entered password
Then user click on create Account button
Then Account creation should be success

@Login
Scenario: Login user into Application under Test
Given user click on SignIn button
When user enter login_email 
Then user enter login_password
Then login should be success