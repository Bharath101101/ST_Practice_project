package Steps;

import static io.restassured.RestAssured.given;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;


public class GitHubSteps {
	Response res;

	@Given("User Enters GitHub base URL and Authentication")
	public void user_enters_git_hub_base_url_and_authentication() {
		given().baseUri("https://api.github.com")
		.basePath("/user/repos")
		.header("Authorization","Bearer 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");
	}

	@When("User executes HTTP get Method")
	public void user_executes_http_get_method() {
		res =given().baseUri("https://api.github.com")
		.basePath("/user/repos")
		.header("Authorization","Bearer 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")
		.when().get();
	 
	}

	@Then("Validate the response status code")
	public void validate_the_response_status_code() {
	    res.prettyPrint();
		Assert.assertEquals(res.statusCode(),200);
	}
}
