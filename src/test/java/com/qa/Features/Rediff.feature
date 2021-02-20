Feature: Validate the rediff application

@SmokeTest@UsabilityTest@RegressionalTest@End2End
Scenario: check the title of the rediff page
Given the user is on rediff home page

@SmokeTest@UsabilityTest
Scenario: Check the total no. of links present on the home page
Given the user is on rediff home page

@SmokeTest@RegressionalTest@End2End
Scenario: check if there is link for sign in
Given the user is on rediff home page

@SmokeTest@UsabilityTest@End2End
Scenario: check if there is link for creating a new account
Given the user is on rediff home page

@End2End
Scenario: Check the login action
Given the user is on rediff home page

@RegressionalTest@End2End
Scenario: Check login action for invalid input
Given the user is on rediff home page

@UsabilityTest
Scenario: check all the footer links
Given the user is on rediff home page

@RegressionalTest
Scenario: check for creating an account with invalid data
Given the user is on rediff home page