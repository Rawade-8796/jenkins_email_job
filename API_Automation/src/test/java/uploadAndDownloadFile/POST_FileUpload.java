package uploadAndDownloadFile;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class POST_FileUpload {
	// URL : https://the-internet.herokuapp.com/upload
		@Test
		public void fileUploadMethod()
		{
			  RestAssured.baseURI="https://the-internet.herokuapp.com";
			  
			  File image=new File("C:\\Users\\Rushikesh\\Desktop\\IMP\\TestImage.jfif");
			  
			  	given()
			  	.multiPart("file",image)
			  	.log().all()
			  	.when()
			  	.post("/upload")
			  	.then()
			  	.log().all()
			  	.extract()
			  	.response();
		}

	}


