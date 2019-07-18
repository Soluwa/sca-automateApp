package stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.Calculator;
import utils.Setup;

public class calculatorSteps extends Setup{
	
	Calculator calculator;
	
	@Given("I launch the calculator app on my phone")
	public void i_launch_the_calculator_app_on_my_phone() {
	     
		Setup.launchApp("emulator-5556", "9", "com.android.calculator2", "com.android.calculator2.Calculator");
	}

	@When("I do addition of two numbers")
	public void i_do_addition_of_two_numbers() {
	  
		calculator = new Calculator();
		calculator.add_2Numbers(6, 9);
	}

	@Then("I should get the right result")
	public void i_should_get_the_right_result() {
	    
	}

}
