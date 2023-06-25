package createSimpleRestAssured;

import org.testng.annotations.Test;

import base.BaseClassServiceNow;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PostChangeRequest extends BaseClassServiceNow{
	
	@Test
	public void createAChangeRequest() {
		Response response = RestAssured
		.given()
		.body("{\"active\":\"true\",\"approval\":\"Pending\",\"description\":\"Created by RestAssured\"}")
		.header("Content-Type","application/json")
		.when()
		.post()
		.then()
		.assertThat()
		.statusCode(201)
		.extract()
		.response();
		
		sys_id = response.jsonPath().get("result.sys_id");
		System.out.println("POST Successful");
	}

}
