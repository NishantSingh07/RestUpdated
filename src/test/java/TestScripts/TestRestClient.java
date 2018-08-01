package TestScripts;

import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.Test;
import com.qa.scripts.RestClient;
import com.qa.testbase.TestBase;

public class TestRestClient extends TestBase{
	TestBase tb=new TestBase();
	String URI = "https://reqres.in/api/users?page=2";	
	

	
	@Test
	public TestRestClient() throws ClientProtocolException, IOException
	{
		RestClient rc = new RestClient();
		rc.RestClient(URI);
		
	}
}
