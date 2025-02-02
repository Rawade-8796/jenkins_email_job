package basicRequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class GET_List_Workspaces {
	
	@Test
	public void getWorkspaceList() {
		
		RestAssured.baseURI="https://api.getpostman.com/";
		
		Response response =
				given()
				.header("x-api-key","PMAK-661119d2b352b700011f0c0b-883fcd907f3da93335354237d57188a250")
				.when()
				.get("workspaces")
				.then()
				.extract()
				.response();
		
	String	final_output=response.asPrettyString();
	
	System.out.println(final_output);
	
	long responseTime =response.getTime();
		
		System.out.println(responseTime);
		
		int StatusCode=response.statusCode();
	
		System.out.println(StatusCode);
	}

}
