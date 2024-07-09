package basicRequest;

import static io.restassured.RestAssured.*;

import static io.restassured.response.Response.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Post_creat_workspace {
	
	@Test
	public void createWorkspaceMethod() {
		
		RestAssured.baseURI="https://reqres.in";
		
		Response response = given()
				            .body("{\r\n"
				            		+ "    \"name\" : \"vinit\",\r\n"
				            		+ "    \"job\" : \"Test\"\r\n"
				            		+ "}")
				           .when()
				           .post("/api/users")
				           .then()
				           .extract()
				           .response();
		
		
	String	final_output = response.asPrettyString();
	
	System.out.println(final_output);
	System.out.println(response.getStatusCode());	
		
		
				       
	}

}
