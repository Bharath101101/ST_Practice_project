package RestAssuredScripts;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class LogMethods {
	@Test(priority='1')
	public void loggingmethods()
	{
		String PMapikey = "PMAK-65447da39e73570038b63344-70bf908e5f1f3aa2a2b348e63357958eb1";
		given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("X-API-Key", PMapikey)
		.when().get()
		//.then().statusCode(200).log().headers()
		//.then().log().ifError()
		//.then().statusCode(200).log().cookies();
		.then().statusCode(200).log().all();
		
		
	}
}
