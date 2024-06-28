package rest_asure;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class Beeceptor {
String url = "https://dummy-json.mock.beeceptor.com";
	
	@Test(enabled = false)
	public void allpost() {
		
	
		RestAssured.baseURI = url;
		given().when().get("/posts").then().statusCode(200).log().all();
	}
	
	@Test(enabled = false)
	public void postbyid() {
		
	
		RestAssured.baseURI = url;
		given().when().get("/posts/1").then().statusCode(200).log().all();
	}
	@Test(enabled = false)
	public void allblogcomment() {
		
	
		RestAssured.baseURI = url;
		given().when().get("/comments").then().statusCode(200).log().all();
	}
	@Test(enabled = false)
	public void blogcommentbyid() {
		
	
		RestAssured.baseURI = url;
		given().when().get("/comments/1").then().statusCode(200).log().all();
	}
	@Test(enabled = false)
	public void listallcompanies() {
		
	
		RestAssured.baseURI = url;
		given().when().get("/companies").then().statusCode(200).log().all();
	}
	@Test(enabled = false)
	public void listcompaniesbyid() {
		
	
		RestAssured.baseURI = url;
		given().when().get("/companies/1").then().statusCode(200).log().all();
	}
	@Test(enabled = false)
	public void listalluserss() {
		
	
		RestAssured.baseURI = url;
		given().when().get("/users").then().statusCode(200).log().all();
	}
	@Test(enabled = false)
	public void userdetailsbyid() {
		
	
		RestAssured.baseURI = url;
		given().when().get("/users/1").then().statusCode(200).log().all();
	}
	@Test(enabled = false)
	public void listofstandardroles() {
		
	
		RestAssured.baseURI = url;
		given().when().get("/roles").then().statusCode(200).log().all();
	}
	@Test(enabled = false)
	public void standardrolebyid() {
		
	
		RestAssured.baseURI = url;
		given().when().get("/roles/1").then().statusCode(200).log().all();
	}
	@Test(enabled = false)
	public void listofalltodoiteam() {
		
	
		RestAssured.baseURI = url;
		given().when().get("/todos").then().statusCode(200).log().all();
	}
	@Test(enabled = false)
	public void todoitembyid() {
		
	
		RestAssured.baseURI = url;
		given().when().get("/todos/1").then().statusCode(200).log().all();
	}
	@Test(enabled = false)
	public void listofquates() {
		
	
		RestAssured.baseURI = url;
		given().when().get("/quotes").then().statusCode(200).log().all();
	}
	@Test(enabled = false)
	public void listofcountries() {
		
	
		RestAssured.baseURI = url;
		given().when().get("/countries").then().statusCode(200).log().all();
	}
	@Test(enabled = true)
	public void listofcontinents() {
		
	
		RestAssured.baseURI = url;
		given().when().get("/continents").then().statusCode(200).log().all();
	}

}
