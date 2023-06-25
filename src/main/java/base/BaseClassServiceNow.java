package base;

import org.testng.annotations.BeforeTest;

import io.restassured.RestAssured;

public class BaseClassServiceNow {
	
	public static String sys_id;

	@BeforeTest
	public void preCondition() {
		RestAssured.baseURI = "https://dev128088.service-now.com/api/now/table/change_request";
		RestAssured.authentication = RestAssured.basic("admin", "India@123");
	}

}
