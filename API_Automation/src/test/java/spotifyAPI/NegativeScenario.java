package spotifyAPI;

import org.testng.annotations.BeforeClass;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class NegativeScenario {
	
	RequestSpecification requestspecification;
	ResponseSpecification responsespecification;
	
	@BeforeClass
	
	public void reqResSpecNegative() {
		
		RequestSpecBuilder requestspecbuilder = new RequestSpecBuilder();
		
		requestspecbuilder.addHeader("Authorization","Bearer BQC-KrkJstw3RalTYdU651nD7jUSb1xSxreC7uouMIAYf9w4wLC72XqKN1surXQB8saiChFTxFVE8eSCBIhcWlLLhZQ4JyS2_mSdbDfFI_6VXlLrWNtw8f8roO6QIBYZ2nukm_Ix0uuA3MUxASuTMGx4fxrL8cl3SMPOce1fqMx7j2GouKaAAJdiYoK3ccmcdyEK8HemergugFA6mThawA6gxadkm3erdhYXHbjwW0Va94gb5XxVWfqpM1UcapPrPKw59DXzlLl8WGJqttt");
		
		requestspecbuilder.setBaseUri("https://api.spotify.com");
		
		requestspecbuilder.setBasePath("v1/users");
		
		requestspecbuilder.log(LogDetail.ALL);
		
		requestspecification = requestspecbuilder.build();
		
		ResponseSpecBuilder responsespecbuilder = new ResponseSpecBuilder();
		
		responsespecbuilder.expectContentType(ContentType.JSON);
		
		responsespecbuilder.log(LogDetail.ALL);
		
		responsespecification = responsespecbuilder.build();
	}
	
	@Test(Enabled=false)
		
	public void createPlaylistMethod() {
		given(requestspecification)
		.body(("{\r\n"
					+ "    \"name\": \"\",\r\n"
					+ "    \"description\": \"Maya songs\",\r\n"
					+ "    \"public\": false\r\n"
					+ "}"
)
		.when()
		.post(("313mlih4sbdx5c33nil3sc3m3pea/playlists")
		.then()
		.spec(responsespecification)
		.assertThat()
		.statusCode(400);
		
	}
	
	@Test(priority=2){
		public void shouldNotBeAuthorized() {
			
			given(requestspecification)
			.body(("{\r\n"
						+ "    \"name\": \"Salaman Songs\",\r\n"
						+ "    \"description\": \"Entertain\",\r\n"
						+ "    \"public\": false\r\n"
						+ "}")
					
			.when()
			.post(("313mlih4sbdx5c33nil3sc3m3pea/playlists")
			.then()
			.spec(responsespecification)
			.assertThat()
			.statusCode(401);
			

			
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
