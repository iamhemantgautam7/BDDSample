@PhaseOne
Feature: Contacts CRUD Management

@SmokeTest @RegressionTest
Scenario: Create a new Ccontact
Given User is logged in
When User create a new contact

@RegressionTest
Scenario: View a Contact
Given User is logged in
When User view contact details

Scenario: Delete a contact
Given User is logged in
When User delete a contact
