package com.sportyShoe.RestAssured;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeletingShoe {
	@Test
	public void delshoe() {
		Response res =RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/delete-shoe")
		.queryParam("id","123").when()
		.delete();
		res.then().log().all();
		int statuscode=res.statusCode();		
		Assert.assertEquals(statuscode,200);
	}

}
