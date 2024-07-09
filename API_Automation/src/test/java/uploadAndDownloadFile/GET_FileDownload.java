package uploadAndDownloadFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class GET_FileDownload {
	// URL : https://the-internet.herokuapp.com/download
			@Test
			public void fileDownloadMethod() throws IOException
			{
				 RestAssured.baseURI="https://the-internet.herokuapp.com";
				 		
				 					byte[] output = 

									 given()
				 					.log().all()
				 					.when()
				 					.get("/download")
				 					.then()
				 					.log().all()
				 					.extract()
				 					.response()
				 					.asByteArray();
				 					
				 	// Code to save the downloaded file 
				 	
				 	File file =new File("C:\\Users\\Rushikesh\\Desktop\\IMP\\fillable_text.pdf");
				 	FileOutputStream os=new FileOutputStream(file);		
				 	os.write(output);
				 	os.close();
			}

	}



