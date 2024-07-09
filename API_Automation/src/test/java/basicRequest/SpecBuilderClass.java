package basicRequest;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;



public class SpecBuilderClass {

	RequestSpecification requestspecification;
	ResponseSpecification reponsespecification;
	
	 @Test(enabled=false)
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
		  	  .extract()
		  	  .response();
	  }
	 @Test
	 public void initreqresp()
	 {
		 		// defining the common specification related to request 
		 		RequestSpecBuilder requestspecbuilder=new RequestSpecBuilder();
		 		requestspecbuilder.setBaseUri("https://api.getpostman.com/");
		 		requestspecbuilder.addHeader("x-api-key", "PMAK-661412070491ad0001d31827-ba0dc81e7fab084eb6ffeb06f4c71a30df");
		 		requestspecbuilder.log(LogDetail.ALL);
		 		requestspecification = requestspecbuilder.build();
		 		
		 	// defining the common specification related to response
		 		ResponseSpecBuilder responsespecbuilder =new ResponseSpecBuilder();
		 		responsespecbuilder.expectStatusCode(200);
		 		responsespecbuilder.expectContentType(ContentType.JSON);
		 		responsespecbuilder.log(LogDetail.ALL);
		 		reponsespecification = responsespecbuilder.build();
		 				
		 		Response response=
		 		given(requestspecification)
		 		.when()
		 		.get("workspaces")
		 		.then()
		 		.spec(reponsespecification)
		 		.extract()
		 		.response();
	 }
	
}

