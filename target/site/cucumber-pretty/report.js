$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Checkout.feature");
formatter.feature({
  "line": 2,
  "name": "Feature check out",
  "description": "description feature",
  "id": "feature-check-out",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Checkout"
    }
  ]
});
formatter.before({
  "duration": 7785616200,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Normal Login",
  "description": "",
  "id": "feature-check-out;normal-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User open website saucedemo",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user input \"standard_user\" as userName and input \"secret_sauce\" as password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User sort product list by name Z to A",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User pick item Sauce Labs Backpack",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User pick item Sauce Labs Fleece Jacket",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User klik keranjang",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User klik remove last item",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.verifyDisplay()"
});
formatter.result({
  "duration": 623960500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 12
    },
    {
      "val": "secret_sauce",
      "offset": 50
    }
  ],
  "location": "LoginSteps.inputCredential(String,String)"
});
formatter.result({
  "duration": 5717883200,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.selectProductContainer()"
});
formatter.result({
  "duration": 2291874700,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.clickItemBasket1()"
});
formatter.result({
  "duration": 1094166800,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.clickItemBasket2()"
});
formatter.result({
  "duration": 1097149500,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.clickKeranjang()"
});
formatter.result({
  "duration": 1138414800,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.clickRemove()"
});
formatter.result({
  "duration": 1114013700,
  "status": "passed"
});
formatter.after({
  "duration": 1071997100,
  "status": "passed"
});
});