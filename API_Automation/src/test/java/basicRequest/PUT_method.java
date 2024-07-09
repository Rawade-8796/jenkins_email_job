package basicRequest;

import static io.restassured.RestAssured.*;

import static io.restassured.response.Response.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PUT_method {
	
	@Test
	public void createWorkspaceMethod() {
		
		RestAssured.baseURI="https://reqres.in";
		
		Response response = given()
				            .body("{\r\n"
				            		+ "    \"name\": \"morpheus\",\r\n"
				            		+ "    \"job\": \"zion resident\"\r\n"
				            		+ "}\r\n"
				            		+ "")
				           .when()
				           .put("/api/users/2")
				           .then()
				           .extract()
				           .response();
		
		
	String	final_output = response.asPrettyString();
	
	System.out.println(final_output);
	System.out.println(response.getStatusCode());	
		
		
				       
	}

}
