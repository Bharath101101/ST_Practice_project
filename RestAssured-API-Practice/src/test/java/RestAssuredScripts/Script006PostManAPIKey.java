package RestAssuredScripts;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.path.json.JsonPath;
import  io.restassured.response.*;

public class Script006PostManAPIKey {
	@Test(priority='1')
	public void postmangetreq() {
		String PMapikey ="PMAK-65447da39e73570038b63344-70bf908e5f1f3aa2a2b348e63357958eb1";
		given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("X-API-Key",PMapikey)
		.when()
		.get()
		.then().statusCode(200).log().all();		
		
	}
	@Test(priority='2')
	public void extract_value_response() {
		String PMapikey ="PMAK-65447da39e73570038b63344-70bf908e5f1f3aa2a2b348e63357958eb1";
		String resoutput=given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("X-API-Key",PMapikey)
		.when()
		.get()
		.then()
		.extract()
		.path("workspaces[1].name");
		
		System.out.println("The name of the workspcase is "+resoutput );
		
	}
	@Test(priority='3')
	public void extract_response_JSONPath() {
		String PMapikey ="PMAK-65447da39e73570038b63344-70bf908e5f1f3aa2a2b348e63357958eb1";
		Response res=given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("X-API-Key",PMapikey)
		.when()
		.get()
		.then()
		.extract()
		.response();
		
		JsonPath json = new JsonPath(res.asString());
		
		System.out.println(json.getString("workspaces[1]"));
		
	}


}
