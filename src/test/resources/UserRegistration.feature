Feature: User Registration
  In order to create a store
  As a Kasheir's applicant
  I want to register successfully

  Background:
    Given applicant navigates to registration page

  Scenario: Main page validation
    When applicant checks the registration page title
    Then title is matching the one available in the design

  Scenario: Validate full name field's placeholder value
    When applicant checks full name's placeholder value
    Then Value is as described