Feature:
  Agile Story 11 : As a PC user, I should be able to download Desktop version of the application.

    Given User should be able to login

  @UserStory11
  Scenario: PC user can able to download desktop version of the application
    Given User should be able to login the page
    When User should be able to click on Mac Os icon under Desktop
    Then User should be able to click on Windows icon under Desktop Client to downloan Windows version of Bitrix.
    Then User should be able to click on Linux icon under Desktop



