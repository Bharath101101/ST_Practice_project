package Steps;

import org.json.JSONObject;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class LessonEndProject {
	@Given("User send a post request to create a user")
	public void user_send_a_post_request_to_create_a_user() {
		JSONObject body = new JSONObject();
		body.put("name", "megha");
		body.put("job","tester");
	   
		RestAssured.given()
		.baseUri("https://reqres.in")
		.basePath("/api/users")
		.contentType(ContentType.JSON)
		.body(body.toString())
		.when().post()
		.then().statusCode(201)
		.log().ifError();
	}

	
	  @Given("User sends a get request to get a user") 
public void user_sends_a_get_request_to_get_a_user() { 
	
		  JSONObject body = new  JSONObject(); 
		  body.put("email","megha@gmail.com");
		  body.put("password","pass");
	  
	  RestAssured.given() .baseUri("https://reqres.in/api/register")
	  .contentType(ContentType.JSON)
	  .body(body.toString())
	  .when().get()//.post("/api/register")
	  .then().statusCode(200);
	  
	  }
	 
	@Given("User sends a get request to get list of users and validate status")
	public void user_sends_a_get_request_to_get_list_of_users_and_validate_status() {
		RestAssured.given()
		.baseUri("https://reqres.in")
		.basePath("/api/unknown")
		.when().get()
		.then().statusCode(200)
		.log().all();
		
	}
}
