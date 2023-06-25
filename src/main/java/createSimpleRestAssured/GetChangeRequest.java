package createSimpleRestAssured;

import org.testng.annotations.Test;

import base.BaseClassServiceNow;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetChangeRequest extends BaseClassServiceNow{
	
	@Test
	public void getAllChangeRequest() {
		
		
		Response response = RestAssured
		.given()
		.log().all()
		.queryParam("sysparm_fields", "sys_id,approval,sys_updated_on")
		.header("Content-Type","application/json")
		.when()
		.get(sys_id)
		.then()
		.assertThat()
		.statusCode(200)
		.extract()
		.response();
		
		response.prettyPrint();
		System.out.println("GET Successful");

	}

}
