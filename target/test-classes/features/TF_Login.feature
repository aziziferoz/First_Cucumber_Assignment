Feature: TechFios login functionality validation 

@Smoke
Scenario: User should be able to login with valid credentials 
	Given User is on the Techfios login page 
	When User enters username as "demo@techfios.com"                     
	When User enters password as "abc123"            
	And User clicks on signin button    
	Then User should land on dashboard page  
	
@Smoke	
Scenario: User should be able to create a new account 
	Given User is on the dashboard page     
	When User clicks on Bank and Cash button    
	When User clicks on New Account  
	And User fills out the form 
	And Clicks submit 
	Then The account should be successfully created 
	