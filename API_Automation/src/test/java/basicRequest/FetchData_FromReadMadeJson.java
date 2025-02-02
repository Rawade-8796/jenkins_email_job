package basicRequest;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;


public class FetchData_FromReadMadeJson {

	@Test
	public void getDataFromJsonMethod() {
		
		JsonPath js = new JsonPath(JsonClass_Data.getJsonData());
		
		// 1. Print No of courses returned by API
	int length	=js.getInt("courses.size()");
	System.out.println("No of courses : "+length);
	
	 // 1. Print Purchase Amount
	System.out.print("Purchase Amount :");
	int Purchase_amount=js.getInt("dashboard.purchaseAmount");
	System.out.println(Purchase_amount);
	
	// 3. Print Title of the first course
	System.out.print("Course Name :");
	String courseName=js.getString("courses[0].title");
	System.out.println(courseName);
	

	// 4. Print All course titles and their respective Prices
	System.out.println("CourseTitle and Price of it :");
	for(int i=0;i<length;i++) {
		String courseNameValue=js.getString("courses["+i+"].title");
		 int priceValue =js.getInt("courses["+i+"].price");
		 System.out.println(courseNameValue+":"+priceValue);
	}
	// 5. Print no of copies sold by RPA Course
	
	System.out.print("No  of Copies of RPA :");
	for(int i=0;i<length;i++) {
		String course	=js.getString("courses["+i+"].title");
		if(course.equals("RPA")) {
			int output=js.getInt("courses["+i+"].copies");
			System.out.println(output);
			
			// 6.Verify if Sum of all Course prices matches with Purchase Amount
			
		 int finalpricevalue=0;
		 
		 for(int j=0;j<length;j++) {
			 int priceValue	= js.getInt("courses["+j+"].price");
			 finalpricevalue = finalpricevalue+priceValue;
		 }
				 		Assert.assertEquals(Purchase_amount,finalpricevalue);
		
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
