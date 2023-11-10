package PhaseEndProject;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;


public class RestAssured001 {
	Logger logger = LogManager.getLogger(RestAssured001.class);
	int id;
	@Test(priority='1')
	public void PetIdpost() {
		logger.info("Course End project - Assignment001 - POST request");
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
				+ "\"status\": \"available\" \r\n"
				+ "}";
		
		id=	RestAssured.given()
		.baseUri("https://petstore.swagger.io/v2/pet")
		.contentType("application/json")
		.body(reqBody)
		.when()
		.post()
		.then()
		.statusCode(200).log().all()
		.body("name", Matchers.equalTo("Simba")).extract().path("id");
		logger.trace("The status code is checked");
		System.out.println(id);
		logger.trace("Id has been captured and validated");
	}
	@Test(priority='2',dependsOnMethods="PetIdpost")
	public void petIDGET() {
		logger.info("Course End project - Assignment001 - GET request");
	 id=RestAssured.given()
	.baseUri("https://petstore.swagger.io/v2/pet/10012")
	.when().get()
	.then()
	.statusCode(200)
	.log()
	.all()
	.body("status",Matchers.equalTo("available")).extract().path("category.id");
	System.out.println(id);
	 logger.trace("Id and status has been captured and validated");
	}
	@Test(priority='3',dependsOnMethods="petIDGET")
	public void petIdDel() {
		logger.info("Course End project - Assignment001 - Delete request");
		RestAssured.given()
		.baseUri("https://petstore.swagger.io/v2/pet/10012")
		.contentType("application/json")
		.when().delete()
		.then()
		.statusCode(200)
		.log()
		.all()
		.body("code",Matchers.equalTo(200))
		.body("type",Matchers.equalTo("unknown"))
		.body("message",Matchers.equalTo("10012"));
	}
}
