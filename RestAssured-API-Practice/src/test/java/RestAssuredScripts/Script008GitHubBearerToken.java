package RestAssuredScripts;

import org.testng.annotations.Test;

import io.restassured.response.Response;

//import static org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.given;

public class Script008GitHubBearerToken {
	@Test(enabled=false)
	public void Authorization_bearertoken() {
		String bearerToken ="Bearer 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";
		Response res =given().baseUri("https://api.github.com")
		.basePath("/user/repos")
		.header("Authorization",bearerToken)
		.when().get()
		.then().statusCode(200)
		.extract().response();
		
		res.prettyPrint();
		
	}
	
	@Test
	public void Authorization_bearertoken_SpecificRepo() {
		String bearerToken ="Bearer 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";
		Response res =given().baseUri("https://api.github.com")
		.basePath("/repos/Bharath101101/Postman-Post-07")
		.header("Authorization",bearerToken)
		.when().get()
		.then().statusCode(200)
		.extract().response();
		
		res.prettyPrint();
		
	}


}
