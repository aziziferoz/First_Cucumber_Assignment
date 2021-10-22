Feature: Bank and Cash functionality validation 

#Background: 



Scenario: User should be able to create a new account 
	Given User is on the dashboard page  
	When User clicks on Bank and Cash button  
	When User clicks on New Account 
	And User fills out the form 
	And Clicks submit 
	Then The account should be successfully created