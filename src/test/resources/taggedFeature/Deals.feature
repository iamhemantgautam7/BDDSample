@PhaseOne
Feature: Deals CRUD Management

@SmokeTest
Scenario: Create a new Deals
Given User is logged in
When User create a new deal

@RegressionTest
Scenario: View a Deal
Given User is logged in
When User view deal details

Scenario: Delete a deal
Given User is logged in
When User delete a deal
