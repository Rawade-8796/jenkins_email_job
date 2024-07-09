package serializationAndDeserialization;


import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import pojo.CreateUserRequestBody_POJO;
import pojo.CreateUserResponseBody_POJO;



public class Pojo_CreateUser {
	
	public void createUserMethodPojo()
	{
		CreateUserRequestBody_POJO  requestObject  = new CreateUserRequestBody_POJO();
		 requestObject.setId(10);	
		 requestObject.setUsername("Rahul123");
		 requestObject.setFirstName("Rahul");
		 requestObject.setLastName("Dravid");
		 requestObject.setEmail("Rahul.Dravid@rediffmail.com");
		 requestObject.setPassword("@72772");
		 requestObject.setPhone("366378272");
		 requestObject.setUserStatus(0);
		 
		 RestAssured.baseURI="https://petstore.swagger.io";
		 
		 CreateUserRequestBody_POJO response = 
				 
				 given()
				 .body(requestObject)  // Serialization 
				 .header("Content-Type","application/json")
				 .log().all()
				 .when()
				 .post("/v2/user")
				 .then()
				 .log().all()
				 .extract()
				 .response().as(CreateUserRequestBody_POJO.class);	
				 
	     Integer codeValue = response.getCode();
	     System.out.println(codeValue);
	     
	     String messageValue = response.getMessage();
	     System.out.println(messageValue);

			
		
		
		
		
		
	}
}
