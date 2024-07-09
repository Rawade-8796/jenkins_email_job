package sendBodyAsSingleObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class POST_MockData {
	
	@Test
	public void postMockMethod()
	{
			RestAssured.baseURI="https://f08b354a-431d-4494-9753-dc7d8de49f36.mock.pstmn.io";
			
			List<HashMap<String,String>> obj=new ArrayList<HashMap<String,String>>();
			
			HashMap<String,String> m1=new HashMap<String,String>();
			m1.put("id", "1003");
			m1.put("type", "Blueberry");
			
			HashMap<String,String> m2=new HashMap<String,String>();
			m2.put("id", "1004");
			m2.put("type", "Devil's Food");
			
			obj.add(m1);
			obj.add(m2);
			
			  given()
			  .body(obj)
			  .log().all()
			  .when()
			  .post("/post")
			  .then()
			  .log().all()
			  .extract()
			  .response();
	}
}


