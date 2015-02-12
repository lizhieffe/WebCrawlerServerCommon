package utils;

import org.json.JSONObject;

public class StringUtil {
	public static JSONObject strToJson(String s) {
		if (s == null)
			return null;
		return new JSONObject(s);
	}
}
