package utils;

public class ConfigUtil {

	public static String getMasterIp() {
		return "";
//		return Play.application().configuration().getString("masterNode.ip");
	}

	public static int getMasterPort() {
		return 1;
	}
}
