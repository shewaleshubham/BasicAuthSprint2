package authentication;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class BearerToken {

	@Test
	
	public void bearerToken()
	{
		baseURI = "https://api.github.com";
		
		JSONObject obj = new JSONObject();
		obj.put("name", "BasicAuthSprint2");
		
		given().auth().oauth2("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")
		.body(obj).contentType(ContentType.JSON)
		.when().post("/user/repos")
		.then().log().all();
	}
}
