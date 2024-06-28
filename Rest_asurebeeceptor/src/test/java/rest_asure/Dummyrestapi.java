package rest_asure;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Dummyrestapi {
String url = "https://dummy.restapiexample.com/api/v1/";
	
	@Test(enabled = false)
	public void getallempdata() {
		RestAssured.baseURI = url;
		given().when().get("employees").then().statusCode(200).log().all();
		
	}
	
	@Test(enabled = false)
	public void getsingleempdata() {
		RestAssured.baseURI = url;
		given().when().get("employee/1").then().statusCode(200).log().all();
		
	}
	
	@Test(enabled = false)
	
	public void createnewrecorddata() {
		RestAssured.baseURI = url;
		JSONObject js = new JSONObject();
		js.put("name","raj kumar");
		js.put("salary", "51100");
		js.put("age", "26");
		given().contentType("application/json").body(js.toJSONString()).when().post("create").then().statusCode(200).log().all();
		
	}
	
	@Test(enabled = false)
	public void updateanemprecord() {
		RestAssured.baseURI = url;
		JSONObject js = new JSONObject();
		js.put("name", "raj");
		js.put("salary", "51100");
		js.put("age", "26");
		given().contentType("application/json").body(js.toJSONString()).when().put("update/3186").then().statusCode(200).log().all();
		
	}
	
	@Test(enabled = true)
	public void deleteanemporder() {
		RestAssured.baseURI = url;
		given().when().delete("delete/2").then().statusCode(200).log().all();
		
	}

}
