package apitest.apitest;


	
	
	
	
	
package apitest.apitest;


	
 
	
	import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import groovy.json.JsonParser;
import io.restassured.RestAssured;
	import io.restassured.http.ContentType;
	import io.restassured.parsing.Parser;
	import io.restassured.path.json.JsonPath;
	import io.restassured.response.Response;
	import io.restassured.specification.RequestSpecification;
    import static io.restassured.RestAssured.given;
    import java.util.List;
    import org.json.simple.JSONArray;
    import org.json.simple.JSONObject;
    import org.json.simple.parser.JSONParser;
    
    public class Apptest {

	

	   @Test
		public  void testResponse(){
	    	Response resp=RestAssured.get("https://apiproxy.paytm.com/v2/movies/upcoming");
			
	    	String responseBody=resp.getBody().asString();
	    AssertJUnit.assertEquals(responseBody.contains("isContenetAvailable"),true);
	    System.out.println(responseBody);
	    JSONParser parse = new JSONParser(responseBody); 
	    JSONObject jobj = (JSONObject)parse.parse(inline);
	    JSONArray jsonarr_1 = (JSONArray) jobj.get(“results”);
	    		
	    		
	    	}
	}	
	    	
	    
		



