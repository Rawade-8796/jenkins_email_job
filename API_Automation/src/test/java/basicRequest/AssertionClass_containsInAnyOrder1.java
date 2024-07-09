package basicRequest;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class AssertionClass_containsInAnyOrder1 {
	
	@Test
	  public void getWorkspaceList()
	  {
		  	  RestAssured.baseURI="https://api.getpostman.com/";
		  	  
		  	  // Method Chaining 
		  	  
Response response=
		  	  given()
		  	  .header("x-api-key","PMAK-6623e4d65bdc610001ff0e4a-233c1afb797b92426f85f3fd9cb03b1a2f")
		  	  .when()
		  	  .get("workspaces")
		  	  .then()
		  	  .assertThat()
		  	  .body("workspaces.name",containsInAnyOrder("My Workspace","ATT Workspace 2"))
		  	  .header("Transfer-Encoding", "chunked")
		  	  .statusCode(200)
		  	  .contentType(ContentType.JSON)
		  	  .extract()
		  	  .response();

}
}