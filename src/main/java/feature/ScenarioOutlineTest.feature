Feature: Login Functionality with Examples
	
		In order to do internet banking
		As a valid  Para Bank customer
		I want to login successfully
		
 
Scenario Outline: Login successful with Examples section

Given I am in the login page of the Para Bank Application
When I entered valid "<username>" and "<password>"
Then I should be taken to the Overview page

Examples:
| username | password |
| EJS| 1234 |
