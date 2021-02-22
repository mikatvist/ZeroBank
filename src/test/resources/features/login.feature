
@login
Feature: Login feature

  Scenario: authorized users should	be able to login
    Given user on the login page
    When user logs in with valid credentials
    Then account summary page should be displayed
@WrongCredentials
    Scenario Outline: user with wrong username
      Given user on the login page
      When user try logs  with invalid credentials
      Then account summary page should be displayed error message

      Examples: Login and/or password are wrong
        | login             | password |
        | usersmyser        | kkMksO2i |
        |                   | password |
        | myname            | WyIUNpDI |
        | student30@library |          |
