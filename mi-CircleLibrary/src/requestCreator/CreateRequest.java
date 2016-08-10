package requestCreator;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CreateRequest {

	public JSONObject createSignUpRequest(String countryCode, String number, String password, String email, String dob, String pinnumber, String gender, String name, String deviceDescp, String device_id) throws JSONException {

		JSONObject jsonObject = new JSONObject();

		jsonObject.put("countryCode", countryCode);
		jsonObject.put("phoneNumber", number);
		jsonObject.put("password", password);
		jsonObject.put("deviceId", device_id);
		jsonObject.put("email", email);
		jsonObject.put("dob", dob);
		jsonObject.put("zipCode", pinnumber);
		jsonObject.put("gender", gender);
		jsonObject.put("name", name);
		jsonObject.put("deviceDesc", deviceDescp);

		return jsonObject;

	}

	public JSONObject createRequest_CreateCircle(String circleAge, String circleName, ArrayList<Integer> userIds, String deviceSession, boolean isPublic, ArrayList<Integer> locationIDs) throws JSONException {

		JSONObject jsonObject = new JSONObject();

		JSONArray jsArray = new JSONArray(userIds);
		JSONArray jArray = new JSONArray(locationIDs);

		jsonObject.put("circleAge", circleAge);
		jsonObject.put("circleName", circleName);
		jsonObject.put("userIds", jsArray);
		jsonObject.put("deviceSession", deviceSession);
		jsonObject.put("isPublic", isPublic);
		jsonObject.put("locationIDs", jArray);

		return jsonObject;

	}

	public JSONObject createRequest_friendsSuggestion(String deviceSession, int limit) throws JSONException {

		JSONObject jsonObject = new JSONObject();

		jsonObject.put("deviceSession", deviceSession);
		jsonObject.put("limit", limit);

		return jsonObject;

	}

	public JSONObject createLoginRequest(String phone, String password, String deviceDescp, String device_id) throws JSONException {

		JSONObject jsonObject = new JSONObject();

		jsonObject.put("phoneNumber", phone);
		jsonObject.put("password", password);
		jsonObject.put("deviceId", device_id);
		// jsonObject.put("email",email);

		jsonObject.put("deviceDesc", deviceDescp);

		return jsonObject;

	}
	
	
	public JSONObject createCheckRequest(String contactNo, String countryCode) throws JSONException {

		JSONObject jsonObject = new JSONObject();

		jsonObject.put("contactNo", contactNo);
		jsonObject.put("countryCode", countryCode);
		
		return jsonObject;

	}


	public JSONObject createRequest_ShareLocWithCircle(ArrayList<Integer> arrCircleID,ArrayList<String> arrLocID, String deviceSession) throws JSONException {

		JSONObject jsonObject = new JSONObject();

		JSONArray jArr_CircleID = new JSONArray(arrCircleID);
		JSONArray jArr_LocID = new JSONArray(arrLocID);
		
		jsonObject.put("circleIDs", jArr_CircleID);
		jsonObject.put("locationIDs", jArr_LocID);	
		jsonObject.put("deviceSession", deviceSession);

		return jsonObject;

	}
	
	public JSONObject createRequest_shareLocationsWithFriends(String deviceSession,ArrayList<String> friendIDs, ArrayList<String> arrLocationID ) throws JSONException {

		JSONObject jsonObject = new JSONObject();

		JSONArray jArr_LocID = new JSONArray(arrLocationID);
		JSONArray jArr_FriendID = new JSONArray(friendIDs);
		
		jsonObject.put("deviceSession", deviceSession);
		jsonObject.put("friendIDs", jArr_FriendID);
		jsonObject.put("locationIDs", jArr_LocID);
		
		

		return jsonObject;

	}

	public JSONObject createGCMRequest(String GCM_ID, String device_Session) throws JSONException {

		JSONObject jsonObject = new JSONObject();

		jsonObject.put("gcmId", GCM_ID);
		jsonObject.put("deviceSession", device_Session);

		return jsonObject;

	}

	public JSONObject createContSyncRequest(ArrayList<String> arr_contacts, String device_Session) throws JSONException {

		JSONObject jsonObject = new JSONObject();

		JSONArray array = new JSONArray(arr_contacts);

		jsonObject.put("contacts", array);
		jsonObject.put("deviceSession", device_Session);

		return jsonObject;

	}

	public JSONObject createGetCircleRequest(String device_Session) throws JSONException {

		JSONObject jsonObject = new JSONObject();

		jsonObject.put("deviceSession", device_Session);

		return jsonObject;

	}

	public JSONObject createVerificationRequest(String OTP, String device_Session) throws JSONException {

		JSONObject jsonObject = new JSONObject();

		jsonObject.put("deviceOTP", OTP);
		jsonObject.put("deviceSession", device_Session);

		return jsonObject;

	}

	public JSONObject createCircleCreationRequest(String circleName, String device_Session, boolean isPublic) throws JSONException {

		JSONObject jsonObject = new JSONObject();

		jsonObject.put("circleName", circleName);
		jsonObject.put("deviceSession", device_Session);
		jsonObject.put("isPublic", isPublic);

		return jsonObject;

	}

	public JSONObject createFriendListRequest(String device_Session) throws JSONException {

		JSONObject jsonObject = new JSONObject();

		jsonObject.put("deviceSession", device_Session);

		return jsonObject;

	}

	public JSONObject createRequest_FriendRequest(String contactNumber, String device_Session) throws JSONException {

		JSONObject jsonObject = new JSONObject();

		jsonObject.put("contactNo", contactNumber);
		jsonObject.put("deviceSession", device_Session);

		return jsonObject;

	}
	
	public JSONObject createSendFriendRequest( String device_Session, String friendUserID) throws JSONException {

		JSONObject jsonObject = new JSONObject();

		
		jsonObject.put("deviceSession", device_Session);
		
		jsonObject.put("friendUserID", friendUserID);

		return jsonObject;

	}

	public JSONObject createRequest_FriendRequest_Response(String acceptStaus, String noti_Id, String device_Session, String noti_type) throws JSONException {

		JSONObject jsonObject = new JSONObject();

		jsonObject.put("acceptanceStatus", acceptStaus);
		jsonObject.put("appNotificationID", noti_Id);
		jsonObject.put("deviceSession", device_Session);
		jsonObject.put("notificationType", noti_type);

		return jsonObject;

	}

	public JSONObject createRequest_Location(String address, String device_Session, String lat, String longitude, String name, String radius) throws JSONException {

		JSONObject jsonObject = new JSONObject();

		jsonObject.put("address", address);
		jsonObject.put("deviceSession", device_Session);
		jsonObject.put("latitude", lat);
		jsonObject.put("longitude", longitude);
		jsonObject.put("name", name);
		jsonObject.put("radius", radius);

		return jsonObject;

	}

	public JSONObject createRequest_LocationShare(String mobileNumber, String device_Session, String locationId) throws JSONException {

		JSONObject jsonObject = new JSONObject();

		jsonObject.put("contactNoWithCountryCode", mobileNumber);
		jsonObject.put("deviceSession", device_Session);
		jsonObject.put("locationID", locationId);

		return jsonObject;

	}

	public JSONObject createRequest_GetAllLocations(String device_Session) throws JSONException {

		JSONObject jsonObject = new JSONObject();

		jsonObject.put("deviceSession", device_Session);

		return jsonObject;

	}

	public JSONObject createUpdateProfileRequest(String device_Session, String dislikes,String dob, String first_name, boolean isInActive, String last_name, String likes, String workplace,String zip) throws JSONException {

		JSONObject jsonObject = new JSONObject();

		jsonObject.put("deviceSession", device_Session);
		jsonObject.put("dislikes",dislikes);
		jsonObject.put("dob",dob);
		jsonObject.put("firstName",first_name);
		jsonObject.put("isInActive", isInActive);
		jsonObject.put("lastName",last_name);
		jsonObject.put("likes",likes);
		jsonObject.put("workplace",workplace);
		jsonObject.put("zip",zip);

		return jsonObject;

	}

	public JSONObject createRequestgetNotification(String device_Session) throws JSONException {

		JSONObject jsonObject = new JSONObject();

		jsonObject.put("deviceSession", device_Session);

		return jsonObject;

	}

	public JSONObject createRequest_deletelocation(String device_Session, String locationId) throws JSONException {

		JSONObject jsonObject = new JSONObject();

		jsonObject.put("deviceSession", device_Session);
		jsonObject.put("locationID", locationId);

		return jsonObject;

	}
	
	public JSONObject createRequest_GetProfileInfo(String device_Session) throws JSONException {

		JSONObject jsonObject = new JSONObject();

		jsonObject.put("deviceSession", device_Session);

		return jsonObject;

	}
	
	public JSONObject createRequest_SearchFriends(String deviceSession, String findTypeId,int limit_id, String  search) throws JSONException {

		JSONObject jsonObject = new JSONObject();

		jsonObject.put("deviceSession", deviceSession);
		jsonObject.put("findTypeID", findTypeId);
		jsonObject.put("limitID", limit_id);
		jsonObject.put("searchString",  search);

		return jsonObject;

	}
	
	
	public JSONObject createRequest_GetImage(String deviceSession, String id,int idType) throws JSONException {

		JSONObject jsonObject = new JSONObject();

		jsonObject.put("deviceSession", deviceSession);
		jsonObject.put("id", id);
		jsonObject.put("idType", idType);
		
		return jsonObject;

	}

	
	public JSONObject createRequest_blockFriend(String friend_user_ID,String deviceSession ) throws JSONException {

		JSONObject jsonObject = new JSONObject();

		jsonObject.put("friendUserID", friend_user_ID);
		jsonObject.put("deviceSession", deviceSession);
		

		return jsonObject;

	}
	
	
	
	
	public JSONObject createRequest_deleteCircle(String cirId,String deviceSession ) throws JSONException {

		JSONObject jsonObject = new JSONObject();

		jsonObject.put("circleID", cirId);
		jsonObject.put("deviceSession", deviceSession);
		

		return jsonObject;

	}
	
	public JSONObject createRequest_deletememberFromCircle(String cirId,String contact,String deviceSession ) throws JSONException {

		JSONObject jsonObject = new JSONObject();

		jsonObject.put("circleID", cirId);
		
		jsonObject.put("contactToDelete", contact);
		
		jsonObject.put("deviceSession", deviceSession);
		

		return jsonObject;

	}
	
	public JSONObject createRequest_deletelocationFromCircle(String cirId,String deviceSession,String locationID ) throws JSONException {

		JSONObject jsonObject = new JSONObject();

		jsonObject.put("circleID", cirId);
		
		jsonObject.put("deviceSession", deviceSession);
		
		jsonObject.put("locationID", locationID);
		

		return jsonObject;

	}
	
	public JSONObject createRequest_unFriend(String deviceSession, String friend_user_ID ) throws JSONException {

		JSONObject jsonObject = new JSONObject();

		
		jsonObject.put("deviceSession", deviceSession);
		jsonObject.put("friendUserID", friend_user_ID);
		

		return jsonObject;

	}
	
	public JSONObject createRequest_unBlockFriend(String deviceSession, String friend_user_ID ) throws JSONException {

		JSONObject jsonObject = new JSONObject();

		
		jsonObject.put("deviceSession", deviceSession);
		jsonObject.put("friendUserID", friend_user_ID);
		

		return jsonObject;

	}
	
	public JSONObject createRequest_panicRelease(String deviceSession ,String panicID ) throws JSONException {

		JSONObject jsonObject = new JSONObject();

		
		jsonObject.put("deviceSession", deviceSession);
		
		jsonObject.put("panicID", panicID);
		

		return jsonObject;

	}
	
	/*public JSONObject createRequest_getPanicData(String deviceSession ,String latitude, String locID ,String longitude,String panicID ) throws JSONException {

		JSONObject jsonObject = new JSONObject();

		
		jsonObject.put("deviceSession", deviceSession);
		
		jsonObject.put("latitude",latitude);
		
		jsonObject.put("locID", locID);
		
		jsonObject.put("longitude", longitude);
		
		jsonObject.put("panicID", panicID);
		

		return jsonObject;

	}
	*/
	
	// /getpanicData
	 public JSONObject createRequest_getPanicData(String deviceSession,String parsedDistance,String lat,String longi,String panicID) throws JSONException {
	   

	  JSONObject jsonObject = new JSONObject();

	  jsonObject.put("deviceSession", deviceSession);
	  
	  jsonObject.put("distanceAway", parsedDistance);
  
	  jsonObject.put("latitude", lat);
	  
	  jsonObject.put("longitude", longi);
	  
	  jsonObject.put("panicID", panicID);
	  

	  return jsonObject;

	 }
	
	public JSONObject createRequest_AddMultipleMember(String cirId,String deviceSession,ArrayList<Integer> userIds ) throws JSONException {

		JSONObject jsonObject = new JSONObject();
		
		JSONArray jsArray = new JSONArray(userIds);

		jsonObject.put("circleID", cirId);
		jsonObject.put("deviceSession", deviceSession);
		jsonObject.put("userIDs", jsArray);
		

		return jsonObject;

	}
	
	public JSONObject createRequest_setLocationActivities(String deviceSession,ArrayList<String>locationsIds,ArrayList<String>locationId) throws JSONException {

		JSONObject jsonObject = new JSONObject();
		
		JSONArray jsArray = new JSONArray(locationsIds);
		JSONArray jnArray = new JSONArray(locationId);
		

		jsonObject.put("deviceSession", deviceSession);
		jsonObject.put("locationsIdsForCheckIn",jsArray);
		jsonObject.put("locationsIdsForCheckOut",jnArray);
		

		return jsonObject;

	}
	
	public JSONObject createRequest_Location_out(String deviceSession,ArrayList<String>locationsIds,ArrayList<String>locationsId ) throws JSONException {

		JSONObject jsonObject = new JSONObject();
		
		
		JSONArray jnArray = new JSONArray(locationsId);
		JSONArray jsArray = new JSONArray(locationsIds);
		jsonObject.put("deviceSession", deviceSession);
		jsonObject.put("locationsIdsForCheckIn",jsArray);
		jsonObject.put("locationsIdsForCheckOut",jnArray);
		

		return jsonObject;

	}
	
	public JSONObject createRequest_getLocationactivity(String deviceSession,String locationID ) throws JSONException {

		JSONObject jsonObject = new JSONObject();

		
		jsonObject.put("deviceSession", deviceSession);
		
		jsonObject.put("locationID", locationID);
		

		return jsonObject;

	}
	
	public JSONObject createForgotPasswordRequest(String phone, String email) throws JSONException {

		JSONObject jsonObject = new JSONObject();

		jsonObject.put("contactNo", phone);
		
		jsonObject.put("emailID", email);
		

		return jsonObject;

	}
	
	public JSONObject OTPValidateRequest(String tempSessionID,String OTP) throws JSONException {

		JSONObject jsonObject = new JSONObject();

		jsonObject.put("tempSession", tempSessionID);
		jsonObject.put("pin", OTP);
		
	
		return jsonObject;

	}
	
	public JSONObject passwordResetRequest(String tempSessionID,String newPassword) throws JSONException {

		JSONObject jsonObject = new JSONObject();

		jsonObject.put("newPassword", newPassword);
		jsonObject.put("tempSession", tempSessionID);
		
	
		return jsonObject;

	}
	
	public JSONObject createRequest_MemberProfile(String deviceSession,String memberId) throws JSONException {

		JSONObject jsonObject = new JSONObject();

		jsonObject.put("deviceSession", deviceSession);
		
		jsonObject.put("memberId", memberId);
		
	
		return jsonObject;

	}
	
	
	public JSONObject createRequest_setNewPassword(String deviceSession,String newpassword,String oldpassword) throws JSONException {

		JSONObject jsonObject = new JSONObject();

		jsonObject.put("deviceSession", deviceSession);
		
		jsonObject.put("newPassword", newpassword);
		
		jsonObject.put("oldPassword", oldpassword);
		
	
		return jsonObject;

	}


	public JSONObject createRequest_Circle_Accept_Request(String acceptStaus, String noti_Id, String device_Session, String noti_type) throws JSONException {

		JSONObject jsonObject = new JSONObject();

		jsonObject.put("acceptanceStatus", acceptStaus);
		jsonObject.put("appNotificationID", noti_Id);
		jsonObject.put("deviceSession", device_Session);
		jsonObject.put("notificationType", noti_type);

		return jsonObject;

	}
	
	
	public JSONObject createRequest_UnshareFriends(String deviceSession,ArrayList<Integer>arr_fids,ArrayList<Integer>locationIDs ) throws JSONException {

		JSONObject jsonObject = new JSONObject();
		
		JSONArray jsArray = new JSONArray(arr_fids);
		JSONArray jnArray = new JSONArray(locationIDs);

		jsonObject.put("deviceSession", deviceSession);
		jsonObject.put("friendIDs",jsArray);
		jsonObject.put("locationIDs",jnArray);
		

		return jsonObject;

	}
	
	public JSONObject createRequest_UnshareCircle(ArrayList<Integer>arr_circleids,String deviceSession,ArrayList<Integer> locationIds ) throws JSONException {

		JSONObject jsonObject = new JSONObject();
		
		JSONArray jsArray = new JSONArray(arr_circleids);
		JSONArray jnArray = new JSONArray(locationIds);
		
		jsonObject.put("circleIDs",jsArray);
		jsonObject.put("deviceSession", deviceSession);
		jsonObject.put("locationIDs",jnArray);
		

		return jsonObject;

	}
	
	// rashid//
	
	//getAllLocatioActivities
	 public JSONObject createRequest_getAllLocationactivities(String deviceSession, String actionId) throws JSONException {

	  JSONObject jsonObject = new JSONObject();

	  
	  jsonObject.put("deviceSession", deviceSession);
	  jsonObject.put("maxlocActivityID", actionId);
	  
	  
	  return jsonObject;

	 }
	 
	 /***************added by Rashid********************************/
	 public JSONObject createRequest_getAllActivePanic(String deviceSession) throws JSONException {

	  JSONObject jsonObject = new JSONObject();

	  
	  jsonObject.put("deviceSession", deviceSession);
	  
	  return jsonObject;

	 }
	 
	 public JSONObject createRequest_panicRespond(String deviceSession,boolean accepted, String panicId) throws JSONException{
			
		 JSONObject jsonObject = new JSONObject();
			
			jsonObject.put("deviceSession", deviceSession);
			jsonObject.put("isAccepted",accepted);
			jsonObject.put("panicID", panicId);
			return jsonObject;
			
		}

/************addded by rashid******************/
	public JSONObject createRequest_deleteUserImage(String device_Session) throws JSONException {

		JSONObject jsonObject = new JSONObject();

			jsonObject.put("deviceSession", device_Session);

		return jsonObject;

	}
	
	//
	public JSONObject createRequest_deletelocationImage(String device_Session, String locationId) throws JSONException {

		JSONObject jsonObject = new JSONObject();

		jsonObject.put("deviceSession", device_Session);
		jsonObject.put("locId", locationId);

		return jsonObject;

	}
	
	//
	public JSONObject createRequest_deleteCircleImage(String device_Session, String circleId) throws JSONException {

		JSONObject jsonObject = new JSONObject();

		jsonObject.put("deviceSession", device_Session);
		jsonObject.put("circleId", circleId);

		return jsonObject;

	}

}

