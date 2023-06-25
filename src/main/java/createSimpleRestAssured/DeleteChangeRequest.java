package createSimpleRestAssured;

import org.testng.annotations.Test;

import base.BaseClassServiceNow;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteChangeRequest extends BaseClassServiceNow{
	
	@Test
	public void deleteTheChangeRequest() {
		
		
		Response response = RestAssured
		.given()
		.log().all()
		.header("Content-Type","application/json")
		.when()
		.delete(sys_id)
		.then()
		.assertThat()
		.statusCode(204)
		.extract()
		.response();
		
		response.prettyPrint();
		System.out.println("DELETE Successful");

	}

}
