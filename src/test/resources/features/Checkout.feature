@Checkout
  Feature: Feature check out
    description feature

    Scenario: Normal Login
      Given User open website saucedemo
      When user input "standard_user" as userName and input "secret_sauce" as password
      And User sort product list by name Z to A
      And User pick item Sauce Labs Backpack
      And User pick item Sauce Labs Fleece Jacket
      And User klik keranjang
      And User klik remove last item