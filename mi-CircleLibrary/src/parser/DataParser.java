package parser;

import java.util.ArrayList;
import java.util.HashMap;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class DataParser {

	static DataParser dataParser;
	ArrayList<String> arr_pending_cont ;

	private DataParser() {

	}

	public static DataParser getInstance() {

		if (null == dataParser) {

			dataParser = new DataParser();
		}
		return dataParser;
	}

	public ArrayList<String> contactDataParser(String response) throws JSONException {

		ArrayList<String> arr_temp = new ArrayList<String>();
		arr_pending_cont = new ArrayList<String>();

		JSONObject object = new JSONObject(response);

		if (object.getString("status").equalsIgnoreCase("1") && object.has("contacts")) {

			JSONArray jsonArray = new JSONArray(object.getString("contacts"));

			for (int i = 0; i < jsonArray.length(); i++) {

				if (jsonArray.getJSONObject(i).getString("Status").equalsIgnoreCase("Add")) {

					String contactNumber = jsonArray.getJSONObject(i).getString("Contact");
					arr_temp.add(contactNumber);

				} else if (jsonArray.getJSONObject(i).getString("Status").equalsIgnoreCase("Pending")) {

					String contactNumber = jsonArray.getJSONObject(i).getString("Contact");

					arr_pending_cont.add(contactNumber);

				}

			}
		} else {

			arr_temp = null;
		}

		return arr_temp;

	}

	public ArrayList<String> getPendingContacts() {
		return arr_pending_cont;
	}

	/***********************************************/

}
