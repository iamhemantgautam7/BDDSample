@PhaseTwo
Feature: Tasks CRUD Management

Background: User Login  #background keyword is use for executing before each scenario
Given User is logged in

@SmokeTest
Scenario: Create a new task
When User create a new task

@RegressionTest
Scenario: View a task
When User view task details


Scenario: Delete a task
When User delete a task
