package basicRequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
public class CreateUser_SwaggerAPI {
	@Test
	public void createUserMethod()
	{
		// URL : https://petstore.swagger.io/v2/user

		  RestAssured.baseURI="https://petstore.swagger.io";
		  
		  given()
		  .body("{\r\n"
		  		+ "  \"id\": 0,\r\n"
		  		+ "  \"username\": \"Vince\",\r\n"
		  		+ "  \"firstName\": \"Victor\",\r\n"
		  		+ "  \"lastName\": \"bob\",\r\n"
		  		+ "  \"email\": \"vincevicotr@gmail.com\",\r\n"
		  		+ "  \"password\": \"Karma\",\r\n"
		  		+ "  \"phone\": \"97362651515\",\r\n"
		  		+ "  \"userStatus\": 0\r\n"
		  		+ "}")
		  .header("content-type","application/json")
		  .log().all()
		  .when()
		  .post("/v2/user")
		  .then()
		  .log().all()
		  .extract()
		  .response();
		  
	}  

}
