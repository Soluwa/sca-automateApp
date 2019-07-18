$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/calculatorTest.feature");
formatter.feature({
  "name": "verify Addition",
  "description": "\tAs a user\n\tI want to launch my calculator app\n\tSo that I can do addition of two numbers",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "run test",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I launch the calculator app on my phone",
  "keyword": "Given "
});
formatter.match({
  "location": "calculatorSteps.i_launch_the_calculator_app_on_my_phone()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I do addition of two numbers",
  "keyword": "When "
});
formatter.match({
  "location": "calculatorSteps.i_do_addition_of_two_numbers()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get the right result",
  "keyword": "Then "
});
formatter.match({
  "location": "calculatorSteps.i_should_get_the_right_result()"
});
formatter.result({
  "status": "passed"
});
});