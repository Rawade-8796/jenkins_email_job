package spotifyAPI;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class GetPlayListClass {

    @Test
    public void getPlayListMethod()
    {
    			RestAssured.baseURI="https://api.spotify.com/v1/playlists/3IEDGd2V4pdITiwn6m0baN";
    			
    			given()
    			.headers("Authorization","Bearer BQC-KrkJstw3RalTYdU651nD7jUSb1xSxreC7uouMIAYf9w4wLC72XqKN1surXQB8saiChFTxFVE8eSCBIhcWlLLhZQ4JyS2_mSdbDfFI_6VXlLrWNtw8f8roO6QIBYZ2nukm_Ix0uuA3MUxASuTMGx4fxrL8cl3SMPOce1fqMx7j2GouKaAAJdiYoK3ccmcdyEK8HemergugFA6mThawA6gxadkm3erdhYXHbjwW0Va94gb5XxVWfqpM1UcapPrPKw59DXzlLl8WGJq")
    			.log().all()
    			.when()
    			.get("")
    			.then()
    			.log().all()
    			.extract()
    			.response();
    }

}








