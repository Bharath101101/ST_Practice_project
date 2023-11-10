package RestAssuredScripts;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import static org.hamcrest.Matchers.equalTo;

public class Script004PayloadJSON {
	@Test
	public void payloadJson() {
		JSONObject body = new JSONObject();
		body.put("name","naive");
		body.put("salary","347475");
		body.put("age","20");
		int responseid =	RestAssured.given()
		.baseUri("https://dummy.restapiexample.com/api/v1")
		.contentType(ContentType.JSON)
		.body(body.toString())
		.when()
		.post("/create")
		.then().statusCode(200)
		.body("data.name", equalTo("naive"))
		.extract()
		.path("data.id");
		
		System.out.println(responseid);
		}

}
