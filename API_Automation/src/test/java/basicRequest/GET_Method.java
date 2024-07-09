package basicRequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;


public class GET_Method {
	
	@Test
	public void getUserMethod() {
		RestAssured.baseURI="https://reqres.in";
		
		Response response =
				
				given()
				.when()
				.get("/api/users?page=2")
				.then()
				.extract()
				.response();
		System.out.println(response);
		
		String final_output =response.asPrettyString();
		
		System.out.println(final_output);
		
		int statusCode_value=response.getStatusCode();
		
		System.out.println(statusCode_value);
		
		 long response_Time = response.getTime();
		 
		 System.out.println(response_Time);
		
		
		
		
	}

}
