$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/SeleniumTraining/BDDCucumber/src/test/java/com/qa/Features/Rediff.feature");
formatter.feature({
  "line": 1,
  "name": "Validate the rediff application",
  "description": "",
  "id": "validate-the-rediff-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "check the title of the rediff page",
  "description": "",
  "id": "validate-the-rediff-application;check-the-title-of-the-rediff-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    },
    {
      "line": 3,
      "name": "@UsabilityTest"
    },
    {
      "line": 3,
      "name": "@RegressionalTest"
    },
    {
      "line": 3,
      "name": "@End2End"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "the user is on rediff home page",
  "keyword": "Given "
});
formatter.match({
  "location": "Rediff_StepDefinition.the_user_is_on_rediff_home_page()"
});
formatter.result({
  "duration": 1318025500,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Check the total no. of links present on the home page",
  "description": "",
  "id": "validate-the-rediff-application;check-the-total-no.-of-links-present-on-the-home-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@SmokeTest"
    },
    {
      "line": 7,
      "name": "@UsabilityTest"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "the user is on rediff home page",
  "keyword": "Given "
});
formatter.match({
  "location": "Rediff_StepDefinition.the_user_is_on_rediff_home_page()"
});
formatter.result({
  "duration": 469100,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "check if there is link for sign in",
  "description": "",
  "id": "validate-the-rediff-application;check-if-there-is-link-for-sign-in",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@SmokeTest"
    },
    {
      "line": 11,
      "name": "@RegressionalTest"
    },
    {
      "line": 11,
      "name": "@End2End"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "the user is on rediff home page",
  "keyword": "Given "
});
formatter.match({
  "location": "Rediff_StepDefinition.the_user_is_on_rediff_home_page()"
});
formatter.result({
  "duration": 734900,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "check if there is link for creating a new account",
  "description": "",
  "id": "validate-the-rediff-application;check-if-there-is-link-for-creating-a-new-account",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@SmokeTest"
    },
    {
      "line": 15,
      "name": "@UsabilityTest"
    },
    {
      "line": 15,
      "name": "@End2End"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "the user is on rediff home page",
  "keyword": "Given "
});
formatter.match({
  "location": "Rediff_StepDefinition.the_user_is_on_rediff_home_page()"
});
formatter.result({
  "duration": 534500,
  "status": "passed"
});
});