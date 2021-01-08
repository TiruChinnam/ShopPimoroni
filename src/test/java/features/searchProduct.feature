Feature:  Search For Product


  @search  @regression
  Scenario:   Verify search for product

    Given    I navigate to url "https://shop.pimoroni.com/"
    Then     I should be navigated to home page
    When     I enter search text as "laptop"
    And      I click on search button
    Then     I should see corresponding results