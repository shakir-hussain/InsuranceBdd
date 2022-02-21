Feature: verify quote from insurance.com

  Scenario: get a auto quote from insurance.com
    Given user is on insurance.com homepage
    When user move cursor to auto insurance tab
    And click on find cheaper car insurance
    And enters zip code
    And select age
    And select current insurance
    And click get quotes
    And click no for multiple drivers household
    And click no for multiple vehicles
    And enters date of birth
    And click next
    Then select your current insurer page arrives
