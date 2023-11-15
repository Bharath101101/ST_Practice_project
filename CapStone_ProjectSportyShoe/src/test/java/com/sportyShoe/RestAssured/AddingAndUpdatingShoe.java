package com.sportyShoe.RestAssured;

import org.testng.annotations.Test;

import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;



public class AddingAndUpdatingShoe {
	@Test
	public void addShoe() {
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/add-shoe")
		.queryParam("id","123")
		.queryParam("image","image_url")
		.queryParam("name","AirJordans")
		.queryParam("category","sneakers")
		.queryParam("sizes","9,10,11")
		.queryParam("price","80000")
		.post().then().statusCode(200)
		.log().all()
		.body("shoe.name",is(not(empty())));
	}
	@Test
	public void updateShoe() {
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/update-shoe")
		.queryParam("id","123")
		.queryParam("image","image_url")
		.queryParam("name","Jordans")
		.queryParam("category","walking")
		.queryParam("sizes","8,9,11")
		.queryParam("price","70000")
		.put().then()
		.statusCode(200)
		.log().all()
		.body("shoe", hasKey("sizes"));
		
	}

}
