package reqandresponseSpecBuilder;
import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;



public class RequestAndResponse_SpecBuilder_Usage {
	RequestSpecification requestspecification;
	ResponseSpecification reponsespecification;
	
	@BeforeClass
	public void initreqandresp()
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
 				
	}
	
  @Test(priority=1)
  public void getWorkspaceDetails()
  {
 		 given(requestspecification)
 		.when()
 		.get("workspaces")
 		.then()
 		.spec(reponsespecification)
 		.extract()
 		.response();
  }
  
  // https://api.getpostman.com/workspaces/1efb8208-03ac-4157-ae41-ae9bd872060b
 
  @Test(priority=2)
  public void getSingleWorkspaceDetails()
  {
	  		given(requestspecification)
	  		.when()
	  		.get("workspaces/1efb8208-03ac-4157-ae41-ae9bd872060b")
	  		.then()
	  		.spec(reponsespecification)
	  		.extract()
	  		.response();
  }
}

