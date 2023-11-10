package PhaseEndProject;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class RestAssured002 {
	@Test(priority='1')
	public void Putreq() {
	String reqBody="{ \r\n"
			+ "\"id\": 10012, \r\n"
			+ "\"category\": { \r\n"
			+ "\"id\": 0, \r\n"
			+ "\"name\": \"string\" \r\n"
			+ "}, \r\n"
			+ "\"name\": \"Simba\", \r\n"
			+ "\"photoUrls\": [ \r\n"
			+ "\"string\" \r\n"
			+ "], \r\n"
			+ "\"tags\": [ \r\n"
			+ "{ \r\n"
			+ "\"id\": 0, \r\n"
			+ "\"name\": \"string\" \r\n"
			+ "} \r\n"
			+ "], \r\n"
			+ "\"status\": \"available_DEV\" \r\n"
			+ "}";
	
	int id=RestAssured.given()
	.baseUri("https://petstore.swagger.io/v2/pet")
	.contentType("application/json")
	.body(reqBody)
	.when()
	.post()
	.then()
	.statusCode(200).log().all()
	.body("name", Matchers.equalTo("Simba")).extract().path("id");
	System.out.println(id);
		
}

	@Test(priority='2',dependsOnMethods = "Putreq")
	public void assignment002Put()
	{
		String reqBody="{ \r\n"
				+ "\"id\": 10012, \r\n"
				+ "\"category\": { \r\n"
				+ "\"id\": 0, \r\n"
				+ "\"name\": \"string\" \r\n"
				+ "}, \r\n"
				+ "\"name\": \"Simba\", \r\n"
				+ "\"photoUrls\": [ \r\n"
				+ "\"string\" \r\n"
				+ "], \r\n"
				+ "\"tags\": [ \r\n"
				+ "{ \r\n"
				+ "\"id\": 0, \r\n"
				+ "\"name\": \"string\" \r\n"
				+ "} \r\n"
				+ "], \r\n"
				+ "\"status\": \"available_DEV\" \r\n"
				+ "}";
		
	int id= RestAssured.given()
		.baseUri("https://petstore.swagger.io/v2/pet")
		.contentType("application/json")
		.body(reqBody)
		.when()
		.post()
		.then()
		.statusCode(200)
		.log().all()
		.body("status", Matchers.equalTo("available_DEV")).extract().path("id");
	
	System.out.println(id);
		
		
	}
}
