package basicRequest;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class AssertionClass_containsInAnyOrder {
	
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
		  	  .body("workspaces.name",containsInAnyOrder("ATT Workspace 2", "My Workspace", "ATT Workspace 3", "ATT Workspace 4", "PutRequestWorkspace", "ATT Workspace 6", "ATT Workspace 7", "ATT Workspace 7", "ATT Workspace 7", "Personal Workspace", "Personal Workspace", "ATT Workspace 7", "ATT Workspace 7", "ATT Workspace 7", "ATT Workspace 7", "ATT_API_4", "ATT Workspace 6", "ATT Workspace 7", "Personal Workspace", "ATT Workspace 5", "ATT Workspace 6", "ATT Workspace Test", "ATT Workspace Test 1", "ATT Workspace Test 2", "ATT Workspace 10", "Test1", "Test10", "Test 29") )
		  	  .statusCode(200) // 
		  	  .contentType(ContentType.JSON)
		  	  .extract()
		  	  .response();
}

}
