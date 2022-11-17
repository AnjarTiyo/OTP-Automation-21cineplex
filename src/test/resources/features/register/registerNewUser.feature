Feature: Register New User

  As an Unregistered User,
  Ganteng want to __register as a new user__
  In order to **become registered user**

  Scenario: Verify Register with valid credentials
    Given Ganteng registering an account on 21cineplex.com
    When He enter valid data
    And He click Register button
    Then Registration is success
    And Message of confirmation email has been sent shown

  Scenario: Verify clicking confirmation email
    Given Ganteng already have confirmation email
    When He click confirmation link
    Then He is officially registered user now

