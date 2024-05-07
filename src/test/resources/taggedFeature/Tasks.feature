@PhaseTwo
Feature: Tasks CRUD Management

@SmokeTest
Scenario: Create a new task
Given User is logged in
When User create a new task

@RegressionTest
Scenario: View a task
Given User is logged in
When User view task details

Scenario: Delete a task
Given User is logged in
When User delete a task
