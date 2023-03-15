@All
Feature: Shop functionality
  @shop1
  Scenario: Verify user is in shop page
    Given  user opens the browser and navigates to "https://practice.automationtesting.in/"
    Then  Click on Shop Menu
    Then verify user is in  the shop page or not
    Then close the browser

  @shop2
Scenario: User adding book  to basket from popularity
    Given user opens the browser and navigates to "https://practice.automationtesting.in/"
    Then  Click on Shop Menu
    Then clicks on default sorting
    Then user selects sort by  popularity
   Then user click one book from sort by popularity
    Then user adding one book to basket
    Then close the browser

  @shop3
  Scenario: Checking ReadMore Functionality of a product from product categories
    Given user opens the browser and navigates to "https://practice.automationtesting.in/"
    Then  Click on Shop Menu
    Then Select javascript from product categories
    Then it should display only Javascript products
    Then click Read more Functionality of a book
    Then close the browser
  @shop4
  Scenario: User viewing basket
    Given user opens the browser and navigates to "https://practice.automationtesting.in/"
    Then  Click on Shop Menu
    Then Select javascript from product categories
    Then user adding book to basket
    Then user click view basket
    Then take a screenshot of view basket
    Then close the browser










