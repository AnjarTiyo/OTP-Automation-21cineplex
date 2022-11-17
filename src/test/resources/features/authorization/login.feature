Feature: User Login

  As an Registered User,
  Ganteng want to __Login with credentials__
  In order to **Book Available Movie**

  Scenario: Verify OTP functionality
    Given Ganteng already on login page
    When He enter valid registered credentials
    Then He will get SMS containing OTP on his Mobile Devices

  Scenario: Verify valid OTP for login
    Given Ganteng already get the OTP
    When He enter valid OTP
    Then He is logged in