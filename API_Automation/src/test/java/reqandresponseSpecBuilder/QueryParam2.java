package reqandresponseSpecBuilder;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import java.util.HashMap;

import io.restassured.response.Response;


public class QueryParam2 {
	 @Test
	  public void getMethod()
	  {
		     RestAssured.baseURI="https://reqres.in/";
		     
		     
		      Response response=
		      given()
		     .queryParam("page", "2")
		     .when()
		     .get("api/users")
		     .then()
		     .log().all()
		     .extract()
		     .response();
	  }

}
