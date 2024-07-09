package basicRequest;


import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasKey;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class AssertionClass_hasKey {
	
		@Test
		  public void getWorkspaceList()
		  {
			  	  RestAssured.baseURI="https://api.getpostman.com/";
			  	  
			  	  // Method Chaining 
			  	  
	Response response=
			  	  given()
			  	  .header("x-api-key","PMAK-661412070491ad0001d31827-ba0dc81e7fab084eb6ffeb06f4c71a30df")
			  	  .when()
			  	  .get("workspaces")
			  	  .then()
			  	  .assertThat()
			  	  .body("workspaces[1]",hasKey("id"))
			  	  .statusCode(200) // 
			  	  .contentType(ContentType.JSON)
			  	  .extract()
			  	  .response();
	}
	}

