package basicRequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;


public class GET_single_workspace {
	
	@Test
	public void getWorkSpaceList() {
	
		RestAssured.baseURI="https://api.getpostman.com/";
		
		Response response =
				 given()
				.header("x-api-key","PMAK-661119d2b352b700011f0c0b-883fcd907f3da93335354237d57188a250")
				.when()
				.get("workspaces/1efb8208-03ac-4157-ae41-ae9bd872060b")
				.then()
				.extract()
				.response();
				
				String Final_output = response.asPrettyString();
		        
		       int Status_code = response.getStatusCode();
		       
		      long response_time = response.getTime();
		      
		      System.out.println(Final_output);
		      
		      System.out.println(Status_code);
		      
		      System.out.println(response_time);
		
		
		
		
		
		
	}
}
