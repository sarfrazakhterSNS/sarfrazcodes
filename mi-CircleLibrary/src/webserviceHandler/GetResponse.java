package webserviceHandler;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;


import requestCreator.Constants_Config;
import android.content.Intent;

public class GetResponse {
	
	public String postData(String url, JSONObject object) throws IOException, JSONException {

		String jResponse = null;
		
		
		DefaultHttpClient httpClient = new DefaultHttpClient();

		HttpPost httpPost = new HttpPost(url);
		
		try {

			StringEntity entity = new StringEntity(object.toString());

			entity.setContentType("application/json");
			
			httpPost.setEntity(entity);

			HttpResponse httpResponse = httpClient.execute(httpPost);

			HttpEntity httpEntity = httpResponse.getEntity();

			jResponse = EntityUtils.toString(httpEntity);

		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(jResponse.contains(Constants_Config.InvalidSession)){
			Intent intent = new Intent(GlobalClass.getInstance().,MainActivity.this)

		return jResponse;

	}
	

}
