package requestCreator;

public class Constants_Config {
	
	public static String InvalidSession = "Invalid device session";

	public static String loginUrl = "https://mi-circle.appspot.com/_ah/api/userApi/v1/loginUser";
	public static String signUpUrl = "https://mi-circle.appspot.com/_ah/api/userApi/v1/signUp";
	public static String verifyUser = "https://mi-circle.appspot.com/_ah/api/userApi/v1/verifyUser";
	public static String set_GCM_Id = "https://mi-circle.appspot.com/_ah/api/userApi/v1/setGCMId";
	public static String sync_Contact = "https://mi-circle.appspot.com/_ah/api/userContactApi/v1/getRegisteredContacts";
	public static String passwordForgetUrl = "https://mi-circle.appspot.com/_ah/api/userApi/v1/passwordForget";
	public static String OTPVerification = "https://mi-circle.appspot.com/_ah/api/userApi/v1/passwordResetOTPVerification";
	public static String passwordReset = "https://mi-circle.appspot.com/_ah/api/userApi/v1/passwordReset";
	public static String setNewPassword = "https://mi-circle.appspot.com/_ah/api/userApi/v1/setNewPassword";
	
	public static String get_Circle = "https://mi-circle.appspot.com/_ah/api/circleApi/v1/getCircles";
	public static String create_Circle = "https://mi-circle.appspot.com/_ah/api/circleApi/v1/createCircle";
	public static String shareLocation_circle = "https://mi-circle.appspot.com/_ah/api/circleApi/v1/addLocationsToCircles";
	public static String verify_User = "https://mi-circle.appspot.com/_ah/api/userApi/v1/verifyUser";
	public static String delete_Circle = "https://mi-circle.appspot.com/_ah/api/circleApi/v1/deleteCircle";
	public static String addMultipleMembersinCircle = "https://mi-circle.appspot.com/_ah/api/circleApi/v1/addMultipleMembersToCircle";
	public static String delete_member = "https://mi-circle.appspot.com/_ah/api/circleApi/v1/deleteMemberFromCircle";
	public static String deleteLocationToCircle = "https://mi-circle.appspot.com/_ah/api/circleApi/v1/deleteLocationToCircle";
	
	/********** Friends *********/
	public static String getFriends = "https://mi-circle.appspot.com/_ah/api/friendApi/v1/getFriends";
	public static String sendFriendRequest = "https://mi-circle.appspot.com/_ah/api/friendApi/v1/sendFriendRequest";
	public static String getFriendSuggetion = "https://mi-circle.appspot.com/_ah/api/friendApi/v1/suggestFriends";
	public static String searchFriends = "https://mi-circle.appspot.com/_ah/api/friendApi/v1/searchFriends";
	public static String blockFriend = "https://mi-circle.appspot.com/_ah/api/friendApi/v1/blockFriend";
	public static String unFriend = "https://mi-circle.appspot.com/_ah/api/friendApi/v1/unFriend";
	public static String unBlockFriend = "https://mi-circle.appspot.com/_ah/api/friendApi/v1/unBlockFriend";
	public static String sendFriendRequestwithID ="https://mi-circle.appspot.com/_ah/api/friendApi/v1/sendFriendRequestWithID";
	public static String MemberProfile ="https://mi-circle.appspot.com/_ah/api/userApi/v1/getMemberProfile";
	
	
	
	/********** Notification *********/
	public static String getNotification = "https://mi-circle.appspot.com/_ah/api/notificationApi/v1/getNotifications";
	public static String sendNotificationResponse = "https://mi-circle.appspot.com/_ah/api/notificationApi/v1/notificationResponse";

	/*********** Location *************/
	public static String createLocation = "https://mi-circle.appspot.com/_ah/api/locationApi/v1/addLocation";
	public static String shareLocation_friends = "https://mi-circle.appspot.com/_ah/api/locationApi/v1/addLocationsWithFriends";
	public static String setlocationactivities = "https://mi-circle.appspot.com/_ah/api/locationApi/v1/setLocationActivities";
	public static String deleteLocation = "https://mi-circle.appspot.com/_ah/api/locationApi/v1/deleteLocation";
	public static String getAllLocations = "https://mi-circle.appspot.com/_ah/api/locationApi/v1/getLocations";
	public static String getlocationactivity="https://mi-circle.appspot.com/_ah/api/locationApi/v1/getLocationActivities";
	public static String unsharelocationfriend="https://mi-circle.appspot.com/_ah/api/locationApi/v1/deleteLocationsWithFriends";
	public static String unsharelocationcircle="https://mi-circle.appspot.com/_ah/api/circleApi/v1/deleteLocationsToCircles";
	public static String defaultFencingDistance = "10";
	
	/************ ImageUploadUrl ****************/
	
	public static String getImageUploadURL = "https://mi-circle-image-upload.appspot.com/imguploadpath";
	public static String getImageUploadLocationURL = "https://mi-circle-image-upload.appspot.com/imgUploadPathForLocation";
	public static String getImageUploadCircleURL ="https://mi-circle-image-upload.appspot.com/imgUploadPathForCircle";
	public static String getImageUploadPathForPanic ="https://mi-circle-image-upload.appspot.com/imgUploadPathForPanic";
	
	/************ ImageDownloadUrl ****************/
	public static String getImageUrl = "https://mi-circle.appspot.com/_ah/api/userApi/v1/getImage";
	
	/**************ImageDeleteUrl*******************************/
	public static String deleteUserImageUrl = "https://mi-circle.appspot.com/_ah/api/userApi/v1/deleteUserImage";
	public static String deleteLocationImageUrl = "https://mi-circle.appspot.com/_ah/api/userApi/v1/deleteLocationImage";
	public static String deleteCircleImageUrl = "https://mi-circle.appspot.com/_ah/api/userApi/v1/deleteCircleImage";
	/***********Panic**********************************/
	
	public static String getPanicData = "https://mi-circle.appspot.com/_ah/api/panicApi/v1/getPanicData";
	public static String panicRelease = "https://mi-circle.appspot.com/_ah/api/panicApi/v1/panicRelease";
	public static String getAllActivePanic = "https://mi-circle.appspot.com/_ah/api/panicApi/v1/getAllActivePanic";
	public static String panicRespond="https://mi-circle.appspot.com/_ah/api/panicApi/v1/panicRespond";
	
	
	
	/*************************************/
	public static String checkUserIfExist = "https://mi-circle.appspot.com/_ah/api/userApi/v1/checkContactNo";
	
	
	/*************************************/

	public static String updatePrileInfo = "https://mi-circle.appspot.com/_ah/api/userApi/v1/updateProfileInfo";
	public static String GetProfileInfo = "https://mi-circle.appspot.com/_ah/api/userApi/v1/getProfileInfo";
	
	public static final String SENDER_ID = "715628983982";
	public static final String EXTRA_MESSAGE = "message";
	public static final String DISPLAY_MESSAGE_ACTION = "com.google.android.gcm.demo.app.DISPLAY_MESSAGE";
	
	/************************myHappeningLocationActivities******************/
	 public static String getAllLocationActivities="https://mi-circle.appspot.com/_ah/api/locationApi/v1/getAllLocationActivities";
	 

}
