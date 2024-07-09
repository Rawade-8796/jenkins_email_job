package spotifyAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetUserIDClass {
	
	@Test
	public void getUserIDMethod() {
		
		RestAssured.baseURI="https://api.spotify.com"; 
		
		given()
		.headers("Authorization","Bearer BQBcSsuAPStL7EPgD0xjZA5WA5N5QHi8HtyJ9VdBtszbekwkrwbS_vD_iv7S6V6rmrZYjyQtx54hL2SR-GHci84uablSj6GHA18rFQLqoRrngRt7PQGk8gnaoqrhckWclDzK_cxlIwx2jugEr3-t3ic5q_4Tq7C8WRBT6qHoo-4LBlT6gAGdiaRETVJMTUaudqrD8yko4D8vNYUHAn_mLQG7xNDslq8GZyRIqG4EhvJAv7qFaS1bUOB3A3AZToDgZWzwk9yTcMSuY3i0\")"
		 .log().all()
		.when()
		.get("/v1/me")
		.then()
		.log().all()
		.extract();
		
		
		
		
		
	}

}
