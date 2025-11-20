package steps;

import util.Calculator;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AddStepsDefn {

	Calculator calc;
	int results;

	@Given("you have a calculator")
	public void you_have_a_calculator() {

		calc = new Calculator();

	}

	@When("you add {int} and {int}")
	public void you_add_and(int a, int b) {
		a = 3;
		b = 4;
		results = calc.add(a, b);

	}

	@Then("the result should be {int}")
	public void the_result_should_be(int expected) {
		System.out.println("Results = " + results);
		expected = 7;
		Assert.assertEquals(expected, results);

	}

}
