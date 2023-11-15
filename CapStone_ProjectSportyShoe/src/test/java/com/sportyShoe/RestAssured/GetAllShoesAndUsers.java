package com.sportyShoe.RestAssured;

import org.testng.Assert;
import org.testng.annotations.Test;
//import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetAllShoesAndUsers {
	@Test(priority='1')
	public void get_all_shoes() {
		Response res1=RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/get-shoes")
		.when().get();
		res1.then().log().all();
		String responsebody=res1.getBody().asString();
		Assert.assertTrue(responsebody.contains("BlueWave Running Shoes"),"Response body doesn't contain expected value");
		
		
	}
	@Test(priority='2')
	public void get_all_user() {
		Response res= RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/get-users")
		.when().get();
		res.then().log().all();
		String responsebody=res.getBody().asString();
		Assert.assertTrue(responsebody.contains("john@example.com"),"Response body doesn't contain expected value");
		
	}
}
