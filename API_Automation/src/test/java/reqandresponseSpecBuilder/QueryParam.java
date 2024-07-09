package reqandresponseSpecBuilder;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import java.util.HashMap;

import io.restassured.response.Response;



public class QueryParam {
	@Test
	  public void getMethod()
	  {
		     RestAssured.baseURI="https://reqres.in/";
		     
		     HashMap<String,String> m=new HashMap<String,String>();
		     m.put("page", "2");
		     m.put("page", "10");
		     
		     
		      Response response=
		      given()
		     .queryParams(m)
		     .when()
		     .get("api/users")
		     .then()
		     .log().all()
		     .extract()
		     .response();
	  }

}
