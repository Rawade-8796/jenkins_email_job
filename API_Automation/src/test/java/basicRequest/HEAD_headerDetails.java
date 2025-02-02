package basicRequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

import java.util.List;

public class HEAD_headerDetails {
	
	@Test
	public void getHeaderDetails()
	{
			RestAssured.baseURI="https://api.getpostman.com";
			
			Response response=
			given()
			.header("x-api-key","PMAK-661119d2b352b700011f0c0b")
			.when()
			.head("/workspaces")
			.then()
			.extract()
			.response();
			
			Headers header = response.headers();
			List <Header>  value = header.asList();
			Header secondHeader =value.get(1);
	     	System.out.print(value);
			System.out.println(secondHeader);
			
			 // 2nd Way >>This used to access specific value of key from head method response 
			
		 List<String> outPut=header.getValues("Content-Type");
		 System.out.println(outPut);
			
		// 3rd Method >> Content of the Response will provide 
		 String content_Value=response.getContentType();	
		 System.out.println(content_Value);

}
}