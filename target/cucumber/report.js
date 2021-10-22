$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/TF_Login.feature");
formatter.feature({
  "line": 1,
  "name": "TechFios login functionality validation",
  "description": "",
  "id": "techfios-login-functionality-validation",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4053628700,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should be able to login with valid credentials",
  "description": "",
  "id": "techfios-login-functionality-validation;user-should-be-able-to-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on the Techfios login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters username as \"demo@techfios.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters password as \"abc123\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User clicks on signin button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User should land on dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_the_Techfios_login_page()"
});
formatter.result({
  "duration": 86701800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 25
    }
  ],
  "location": "LoginStepDefinition.user_enters_username_as(String)"
});
formatter.result({
  "duration": 110478500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 25
    }
  ],
  "location": "LoginStepDefinition.user_enters_password_as(String)"
});
formatter.result({
  "duration": 93769400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_signin_button()"
});
formatter.result({
  "duration": 1470547100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_should_land_on_dashboard_page()"
});
formatter.result({
  "duration": 10989000,
  "status": "passed"
});
formatter.before({
  "duration": 3300415600,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "User should be able to create a new account",
  "description": "",
  "id": "techfios-login-functionality-validation;user-should-be-able-to-create-a-new-account",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "User is on the dashboard page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "User clicks on Bank and Cash button",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User clicks on New Account",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User fills out the form",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Clicks submit",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "The account should be successfully created",
  "keyword": "Then "
});
formatter.match({
  "location": "BankAndCashStepsDefinition.User_is_on_the_dashboard_page()"
});
formatter.result({
  "duration": 4407042500,
  "status": "passed"
});
formatter.match({
  "location": "BankAndCashStepsDefinition.user_clicks_on_Bank_and_Cash_button()"
});
formatter.result({
  "duration": 63830400,
  "status": "passed"
});
formatter.match({
  "location": "BankAndCashStepsDefinition.user_clicks_on_New_Account()"
});
formatter.result({
  "duration": 1146911500,
  "status": "passed"
});
formatter.match({
  "location": "BankAndCashStepsDefinition.user_fills_out_the_form()"
});
formatter.result({
  "duration": 621033700,
  "status": "passed"
});
formatter.match({
  "location": "BankAndCashStepsDefinition.clicks_submit()"
});
formatter.result({
  "duration": 1230109000,
  "status": "passed"
});
formatter.match({
  "location": "BankAndCashStepsDefinition.the_account_should_be_successfully_created()"
});
formatter.result({
  "duration": 18600,
  "status": "passed"
});
});