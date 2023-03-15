@Run
Feature: Checkout functionality
  @check
  Scenario:When user leaves one mandatory field blank in checkout

    Given user opens the browser and navigates to "https://practice.automationtesting.in/"
    Then add product to basket and proceed to checkout
    When filling billing details
    Then user leaves one mandatory field blank
    Then place order
    Then close the button


    @check1
    Scenario:Checkout as a registered user
      Given user opens the browser and navigates to "https://practice.automationtesting.in/"
      Then add product to basket and proceed to checkout
     Then  login to user account
      Then filling billing details
      Then place order
      Then user takes a screenshot of placeorder
      Then close the button

      @view-order
      Scenario: User checking his order
        Given user opens the browser and navigates to "https://practice.automationtesting.in/"
        Then login into account again
        Then click on order menu
        Then user takes a screenshot of orders from account
        Then close the button





