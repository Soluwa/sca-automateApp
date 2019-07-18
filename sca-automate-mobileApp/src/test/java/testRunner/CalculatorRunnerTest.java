package testRunner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/features"},
glue = {"classpath:stepDef"},
plugin = {"pretty", "html:target/cucumber-html-report",
"json:target/cucumber.json"})
@Test
public class CalculatorRunnerTest extends AbstractTestNGCucumberTests{

}
