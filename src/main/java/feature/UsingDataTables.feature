Feature: Login Functionality with data table
	
		In order to do internet banking
		As a valid  Para Bank customer
		I want to login successfully
		
 
Scenario: Login successful with data table

Given I am in the login page of the Para Bank Application
When I entered valid credentials using dataTable
	|EJS|1234|
Then I should be taken to the Overview page