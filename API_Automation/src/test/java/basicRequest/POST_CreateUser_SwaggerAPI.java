package basicRequest;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


public class POST_CreateUser_SwaggerAPI {

	  @Test
	  public void getWorkspaceList()
	  {
		  	  RestAssured.baseURI="https://petstore.swagger.io";
		  	  
		  	  // Method Chaining 
		  	  
Response response=
		  	  given()
		  	  .when()
		  	  .get("/v2/user/login?username=Rushikesh&password=r123")
		  	  .then()
		  	  .extract()
		  	  .response();

				String final_output=response.asPrettyString();
				System.out.println(final_output);
				int status_code=response.statusCode();
				System.out.println(status_code);
				
				JsonPath js=response.jsonPath();
				int code_value=js.getInt("code");
				System.out.println(code_value);
				
				String type_value=js.getString("type");
				System.out.println(type_value);
				
			
				Assert.assertEquals(code_value, 200);
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				

}
}