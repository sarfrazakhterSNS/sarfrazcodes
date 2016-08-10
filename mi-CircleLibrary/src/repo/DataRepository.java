package repo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class DataRepository {
	
	 public static DataRepository dataRepository;
	 
	
	
	/*private DataRepository(){
		
		//Do Nothing
	}*/
	
	public static DataRepository getInstance(){
		
		if(dataRepository == null){ 
			
			dataRepository = new DataRepository();
		}
		return dataRepository;
	}
	
	/********************Session ID*********************************/
	public void putDeviceSessionInPref(Context context,String sessionID){
		SharedPreferences pref = context.getSharedPreferences("PREF_SID", Context.MODE_PRIVATE);
		SharedPreferences.Editor editor = pref.edit();
		
		editor.putString("SESSIONID", sessionID);
		editor.commit();
	}
	
	public String getSessionId(Context context){
		SharedPreferences prefs = context.getSharedPreferences("PREF_SID",Context.MODE_PRIVATE);
		
		String id = prefs.getString("SESSIONID", null);
		return id;
	}
	
	public void clearSessionId(Context context){
		
		Editor editor = context.getSharedPreferences("PREF_SID", Context.MODE_PRIVATE).edit();
		editor.clear();
		editor.commit();
		
	}
	
	/*************************Panic Data***********************************/
	
	public void putPanicIDInPref(Context context,String panicID){
		SharedPreferences pref = context.getSharedPreferences("PREF_PANICID", Context.MODE_PRIVATE);
		SharedPreferences.Editor editor = pref.edit();
		
		editor.putString("panicID", panicID);
		editor.commit();
	}
	
	public String getpanicID(Context context){
		SharedPreferences prefs = context.getSharedPreferences("PREF_PANICID",Context.MODE_PRIVATE);
		
		String id = prefs.getString("panicID", null);
		return id;
	}
	
	public void clearpanicID(Context context){
		
		Editor editor = context.getSharedPreferences("PREF_PANICID", Context.MODE_PRIVATE).edit();
		editor.clear();
		editor.commit();
		
	}
	
	
	
	
	/*****************************************************/
	
	/********************Chat ID
	 * @param <ChatUser>*********************************/
	@SuppressWarnings("unchecked")
	public <ChatUser> void putChatUserInPref(Context context, List<ChatUser> list){
		SharedPreferences prefs = context.getSharedPreferences("CHAT_USER", Context.MODE_PRIVATE);
	    SharedPreferences.Editor editor = prefs.edit();
	    String prefix = null;
	   
	    int size = prefs.getInt(prefix+"_size", 0);

	    // clear the previous data if exists
	    for(int i=0; i<size; i++)
	        editor.remove(prefix+"_"+i);

	    // write the current list
	    
	   
	    for(int i=0; i<list.size(); i++)
	        editor.putStringSet(prefix+"_"+i, (Set<String>) list.get(i));

	    editor.putInt(prefix+"_size", list.size());
	    editor.commit();
	}
	
	public static List<String> readList (Context context)
	{
	    SharedPreferences prefs = context.getSharedPreferences("CHAT_USER", Context.MODE_PRIVATE);
	    String prefix = null;
	    int size = prefs.getInt(prefix+"_size", 0);

	    List<String> data = new ArrayList<String>(size);
	    for(int i=0; i<size; i++)
	        data.add(prefs.getString(prefix+"_"+i, null));

	    return data;
	}
	
	public String getChatId(Context context){
		SharedPreferences prefs = context.getSharedPreferences("PREF_SID",Context.MODE_PRIVATE);
		
		String id = prefs.getString("SESSIONID", null);
		return id;
	}
	
	/*public void clearChatId(Context context){
		
		Editor editor = context.getSharedPreferences("PREF_SID", Context.MODE_PRIVATE).edit();
		editor.clear();
		editor.commit();
		
	}*/
	
	
	/*public void putUserIDInPref(Context context,String userID){
		SharedPreferences pref = context.getSharedPreferences("PREF_USERID", Context.MODE_PRIVATE);
		SharedPreferences.Editor editor = pref.edit();
		
		editor.putString("userID", userID);
		editor.commit();
	}
	
	public String getUserID(Context context){
		SharedPreferences prefs = context.getSharedPreferences("PREF_SID",Context.MODE_PRIVATE);
		
		String id = prefs.getString("userID", null);
		return id;
	}
	
	public void clearUserID(Context context){
		
		Editor editor = context.getSharedPreferences("PREF_SID", Context.MODE_PRIVATE).edit();
		editor.clear();
		editor.commit();
		
	}
	
	*//************************************************************//*
	
	public void putLatitudeInPref(Context context,String latitude){
		SharedPreferences pref = context.getSharedPreferences("PREF_SID", Context.MODE_PRIVATE);
		SharedPreferences.Editor editor = pref.edit();
		
		editor.putString("latitude", latitude);
		editor.commit();
	}
	
	public String getLatitude(Context context){
		SharedPreferences prefs = context.getSharedPreferences("PREF_SID",Context.MODE_PRIVATE);
		
		String id = prefs.getString("latitude", null);
		return id;
	}
	
	public void clearLatitude(Context context){
		
		Editor editor = context.getSharedPreferences("PREF_SID", Context.MODE_PRIVATE).edit();
		editor.clear();
		editor.commit();
		
	}
	
	*//*********************************************************//*
	
	public void putLongitudeInPref(Context context,String longitude){
		SharedPreferences pref = context.getSharedPreferences("PREF_SID", Context.MODE_PRIVATE);
		SharedPreferences.Editor editor = pref.edit();
		
		editor.putString("longitude", longitude);
		editor.commit();
	}
	
	public String getLongitude(Context context){
		SharedPreferences prefs = context.getSharedPreferences("PREF_SID",Context.MODE_PRIVATE);
		
		String id = prefs.getString("longitude", null);
		return id;
	}
	
	public void clearLongitude(Context context){
		
		Editor editor = context.getSharedPreferences("PREF_SID", Context.MODE_PRIVATE).edit();
		editor.clear();
		editor.commit();
		
	}
	*/
	//...............................profile data update..........................................................................//
	
	public void putGenderInPref(Context context,String gender){
		SharedPreferences pref = context.getSharedPreferences("PREF_SID", Context.MODE_PRIVATE);
		SharedPreferences.Editor editor = pref.edit();
		
		editor.putString("gender",gender);
		editor.commit();
	}
	
	public String getGender(Context context){
		SharedPreferences prefs = context.getSharedPreferences("PREF_SID",Context.MODE_PRIVATE);
		
		String id = prefs.getString("gender", null);
		return id;
	}
	
	public void clearGender(Context context){
		
		Editor editor = context.getSharedPreferences("PREF_SID", Context.MODE_PRIVATE).edit();
		editor.clear();
		editor.commit();
		
	}
	
	 public void putMobileNumInPref(Context context,String mobileNum){
		  SharedPreferences pref = context.getSharedPreferences("PREF_MOBILE", Context.MODE_PRIVATE);
		  SharedPreferences.Editor editor = pref.edit();
		  editor.putString("MobileNumber", mobileNum);
		  editor.commit();
		 }
		 
		 public String getMobileNum(Context context){
		  SharedPreferences prefs = context.getSharedPreferences("PREF_MOBILE",Context.MODE_PRIVATE);
		  String id = prefs.getString("MobileNumber", null);
		  return id;
		 }
	
}
