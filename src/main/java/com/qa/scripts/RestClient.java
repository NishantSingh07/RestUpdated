package com.qa.scripts;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.HashMap;
import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class RestClient  {
		
	String URL;
	int Status_Code;
	String URI = "https://reqres.in/api/users?page=2";
	

               
         //  (RestClient=CloseableHttpClient getHttpClient
      
          public CloseableHttpClient RestClient(String url) throws ClientProtocolException, IOException {
        	  
        		// For Sending Rest Request
       	   
              CloseableHttpClient httpClient = HttpClients.createDefault();
              HttpGet httpget = new HttpGet(URI);
              
              //  Get Status Code Response
    	      CloseableHttpResponse res=  httpClient.execute(httpget);
    	      System.out.println("Response code is :----->" + res.getStatusLine().getStatusCode());
    	 
		    		 
	     // Get Json Resopnse
	         String resbody = EntityUtils.toString(res.getEntity(),"UTF-8");
	         JSONObject obj = new JSONObject(resbody);
	         System.out.println("Jason Response body :-------->"+ obj);
	      
	         
	  	  // Get All Header 
	         
	        Header[] headarray = res.getAllHeaders();
	        
	         HashMap <String,String> map = new HashMap<String,String>();
	         
	         for(Header head :headarray )
	         {
	        	 map.put(head.getName(), head.getValue());
	        	 
	         }
	        		
	        	 
	      return httpClient;
	         
	         
     }
	
}
