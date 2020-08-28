$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/classTasks.feature");
formatter.feature({
  "name": "Class tasks",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@classTasks"
    }
  ]
});
formatter.scenario({
  "name": "Testing chase bank",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@classTasks"
    },
    {
      "name": "@chase"
    }
  ]
});
formatter.before({
  "error_message": "java.lang.NullPointerException\r\n\tat utils.ConfigReader.readProperty(ConfigReader.java:18)\r\n\tat utils.Driver.getDriver(Driver.java:14)\r\n\tat step_definitions.Hooks.setUp(Hooks.java:19)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I open \"chase bank\"",
  "keyword": "Given "
});
formatter.match({
  "location": "step_definitions.ClassTaskSteps.iOpen(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I verify title is \"Credit Card, Mortgage, Banking, Auto | Chase Online | Chase.comS\"",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.ClassTaskSteps.iVerifyTitleIs(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click \"ATM \u0026 branch\" button",
  "keyword": "When "
});
formatter.match({
  "location": "step_definitions.ClassTaskSteps.iClickButton(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "error_message": "java.lang.NullPointerException\r\n\tat utils.ConfigReader.readProperty(ConfigReader.java:18)\r\n\tat utils.Driver.getDriver(Driver.java:14)\r\n\tat utils.SeleniumUtils.waitForPageToLoad(SeleniumUtils.java:38)\r\n\tat step_definitions.Hooks.tearDown(Hooks.java:27)\r\n",
  "status": "failed"
});
});