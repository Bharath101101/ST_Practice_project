package Steps;

import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.hasKey;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APIEndPointsSteps {
	@Given("Retrieve the list of all products in the store")
	public void retrieve_the_list_of_all_products_in_the_store() {
		Response res1=RestAssured.given()
				.baseUri("http://localhost:9010")
				.basePath("/get-shoes")
				.when().get();
				res1.then().log().all();
				String responsebody=res1.getBody().asString();
				Assert.assertTrue(responsebody.contains("BlueWave Running Shoes"),"Response body doesn't contain expected value");
				
	}

	@Given("Retrieve the list of all registered users")
	public void retrieve_the_list_of_all_registered_users() {
		Response res= RestAssured.given()
				.baseUri("http://localhost:9010")
				.basePath("/get-users")
				.when().get();
				res.then().log().all();
				String responsebody=res.getBody().asString();
				Assert.assertTrue(responsebody.contains("john@example.com"),"Response body doesn't contain expected value");
	}

	@Then("Add the product")
	public void add_the_product() {
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


	@Then("Update the product")
	public void update_the_product() {
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
	@Then("Delete the product")
	public void delete_the_product() {
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
