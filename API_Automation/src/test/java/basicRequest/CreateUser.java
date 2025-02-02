package basicRequest;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;



public class CreateUser {


	@Test
	public void createAUser()
	{
	   RestAssured.baseURI="https://petstore.swagger/io/v2";
	  Response response= given()
	  .header("content-Type","application/json")
	  .header("accept","application/json")
	  .body("{\r\n"
	  		+ "  \"id\": 1,\r\n"
	  		+ "  \"petId\": petid1,\r\n"
	  		+ "  \"quantity\": qty1,\r\n"
	  		+ "  \"shipDate\": \"2024-04-12T01:25:40.357Z\",\r\n"
	  		+ "  \"status\": \"placed\",\r\n"
	  		+ "  \"complete\": true\r\n"
	  		+ "}")
	  .when()
	  .post("/store/order")
	  .then()
	  .extract()
	  .response();

	String resp1=response.asPrettyString();	
	System.out.println(resp1);

	JsonPath jp=response.jsonPath(); // response is output which we receive after chaining method
	int petId_value=jp.getInt("petId");
	System.out.println(petId_value);

	String status_value=jp.getString("status");
	System.out.println("status from API "+status_value);

	String complete_value=jp.getString("complete"); // Unknown 
	System.out.println(complete_value);
	   
}
}