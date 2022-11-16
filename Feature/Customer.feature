
Feature: Customer

Background: 
Given User Launch Chrome browser 
	When User opens URL "http://admin-demo.nopcommerce.com/login" 
	And User enters Email as "admin@yourstore.com" and Password as "admin" 
	And Click on Login 
	Then User can view Dashboard

  Scenario: Add new customer
    
	When User clicks on customers Menu
	And User clicks on customers Menu Item
	And clicks on add new button
	Then User can view Add new customer page
	When user entre customer info
	And clicks on save button
	Then user can view confirmation message "The new customer has been added successfully."
	And close browser
	
Scenario: Search Customer by Email

When User clicks on customers Menu
	And User clicks on customers Menu Item
	And Enter customer EMail
	When Click on search button
	Then User should found Email in the Search table
	And close browser 
  
  	Scenario: Search Customer by Name
	
	
  When User clicks on customers Menu
	And User clicks on customers Menu Item
	And Enter customer FirstName
	And Enter customer LastName
	When Click on search button
	Then User should found Name in the Search table
	And close browser 
