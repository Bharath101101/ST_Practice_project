package RestAssuredScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Script009PayPalOauth2 {
	String accessToken;
	@Test(priority='1')
	public void GetAcessToken() {
	String clientID="ASddOBmvrRX-4bDhrkuYmw1ysdo8rxL9LvM_qQclZEvrcwM7UPQfh2m2Ncf-k8tOeZNKpwK_i8_vS5SM";
	String clientSecret="EBaFoWjqpmTScFAJY866I211Oh7_4_CXGL3wtjkhkzVJLkgtzP93Ob5sjxBz6m1-L2So7y5lomfTT-yV";
	
		Response res=	RestAssured.given()
	.baseUri("https://api-m.sandbox.paypal.com")
	.basePath("/v1/oauth2/token")
	.auth().preemptive().basic(clientID, clientSecret)
	.param("grant_type","client_credentials")
	.when().post();
			
		res.prettyPrint();
		Assert.assertEquals(res.statusCode(), 200);
		
		accessToken =res.getBody().path("access_token");
		
		System.out.println(accessToken);
	}
	@Test(priority='2')
	public void PayPalTestAPI() {
		Response res=RestAssured.given()
		.baseUri("https://api-m.sandbox.paypal.com")
		.basePath("/v1/invoicing/invoices")
		.queryParam("page",3)
		.queryParam("page_size",4)
		.queryParam("total_count_required",true)
		.auth().oauth2(accessToken)
		.when().get();
		
		res.prettyPrint();
	}

}
