package basicRequest;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.response.Response.*;

public class FetchData_fromJSon {

	@Test
	public void fetchDetailsFromJson() {
		
		RestAssured.baseURI ="https://reqres.in";
		
		 RestAssured.baseURI="https://reqres.in/";
	     Response response=given()
	     .when()
	     .get("api/users/2")
	     .then()
	     .extract()
	     .response();
	     
	     JsonPath jp=response.jsonPath();
		String firstName_value=jp.getString("data.first_name");
		System.out.println("First name of data :"+firstName_value);
			
	}
	
	
}
