package spotifyAPI;

import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class CreatePlayListClass {
	
	RequestSpecification requestspecification;
	ResponseSpecification responsespecication;
	private ResponseSpecification responsespecification;
	
	@BeforeClass
	
	public void reqResSpec() {
		
		RequestSpecBuilder requestspecbuilder = new RequestSpecBuilder();
		
		requestspecbuilder.setBaseUri("https://api.spotify.com");
		
		requestspecbuilder.setBasePath("v1/users");
		
		requestspecbuilder.addHeader("Authorization","Bearer BQCZM0rXD58fveNMCIaNrxC_wJCB6TR7aAzuyqA4nRRXWYSUBEMQ7evTL_s8UPwC2ZY7I1nB4ch44S3zDkyf8QH6d7vEqZlr8ix8cCBQIlKNmNDZaH3TOuBuu3GZ6_kf2JXEh5-QDZLd6zxJCyNG3JREkahN2_maJMZxCdxgTCmymqVahRceToB6m_7JHX-MVyknrOMcJ3-QYFLO3Gbo8lduKECBkJy2el81puoph3lHtgRTucZERX7gfuy4KpJ1GXVaiyt01JUd0nlT");
		
		requestspecbuilder.setAccept(ContentType.JSON);
		
		requestspecbuilder.log(LogDetail.ALL);
		
		requestspecification = requestspecbuilder.build();
		
		ResponseSpecBuilder responsespecbuilder=new ResponseSpecBuilder();
		
		responsespecbuilder.expectContentType(ContentType.JSON);
		
		responsespecbuilder.log(LogDetail.ALL);
		
		responsespecification =responsespecbuilder.build();
			
	}
	
	@Test
	
	public void createPlayListMethod() {
		
		
		given()
		.spec(requestspecification)
		.body(("{\r\n"
				+ " \"name\": \"SRK Songs\",\r\n"
				+ " \"description\": \"Entertaining\",\r\n"
				+ " \"public\": false\r\n"
				+ "}"
)
		.when()
		.post(("/313mlih4sbdx5c33nil3sc3m3pea/playlists")
		.then()
		.spec(responsespecification)
		.body("name", equalTo("SRK Songs")); 
		
		
			
	}

	
	}
	

