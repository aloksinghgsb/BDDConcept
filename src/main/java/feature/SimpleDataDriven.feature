Feature: Login Functionality with simple data driven
	
		In order to do internet banking
		As a valid  Para Bank customer
		I want to login successfully
		
 
Scenario: Login successful with simple data driven

Given I am in the login page of the Para Bank Application
When I entered "tautester" and "password"
Then I should be taken to the Overview page