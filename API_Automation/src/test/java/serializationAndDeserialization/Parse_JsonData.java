package serializationAndDeserialization;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class Parse_JsonData {
	
	@Test
	public void createWorkspace_parsing() {
		
		HashMap<String,Object> m=new HashMap<String,Object>();
		  HashMap<String,String> value=new HashMap<String,String>();
		  value.put("name","Test10");
		  value.put("type","personal");
		  value.put("description","Test Workspace 10");
		  m.put("workspace",value);
		
		RestAssured.baseURI="https://api.getpostman.com";
		
		given()
		.header("x-api-key","PMAK-661412070491ad0001d31827-ba0dc81e7fab084eb6ffeb06f4c71a30df")
		.body(m)
		.log().all()
		.when()
		.post("/workspaces")
		.then()
		.log().all()
		.extract()
		.response();
		
		
		
		
		
	}

}
