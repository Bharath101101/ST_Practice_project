package RestAssuredScripts;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import static org.hamcrest.Matchers.*;

public class Script007HamcrestValidateMethods {
	@Test(enabled=false)
	public void validateResponseBody() {
		String PMapikey ="PMAK-65447da39e73570038b63344-70bf908e5f1f3aa2a2b348e63357958eb1";
		given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("X-API-Key",PMapikey)
		.when()
		.get()
		.then().statusCode(200)
		.body("workspaces[1].id",equalTo("f101052b-a3b2-4764-aa7e-94b4c01e58c7"),
				"workspaces[1].name",equalTo("Phase3-PostMan-Practice"),
				 "workspaces[1].type",equalTo("personal"));		
		
	}
	@Test(enabled=false)
	public void validateResponseBody_equalTo() {
		given().baseUri("https://petstore.swagger.io")
		.basePath("/v2/user/Uname001")
		.when()
		.get()
		.then().statusCode(200)
		.body("username",equalTo("Uname001"),
				"email",equalTo("Positive@Attitude.com"),
				"userstatus",equalTo(null));		
		
	}
	@Test
	public void validateResponseBody_hasItems() {
		String PMapikey ="PMAK-65447da39e73570038b63344-70bf908e5f1f3aa2a2b348e63357958eb1";
		given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("X-API-Key",PMapikey)
		.when()
		.get()
		.then().statusCode(200)
		.body("workspaces.name",hasItems("Team Workspace","Phase3-PostMan-Practice"),
				"workspaces.type",hasItems("team","personal"));
		
	}


}
