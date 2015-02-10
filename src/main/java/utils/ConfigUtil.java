package utils;

import java.io.IOException;
import java.util.Properties;

public class ConfigUtil {

	public static String getMasterIp() {
		return "";
//		return Play.application().configuration().getString("masterNode.ip");
	}

	public static int getMasterPort() {
		return 1;
	}
	
//	public static void get() {
//		try {
//			Resource resource = new ClassPathResource("/my.properties");
//			Properties props = PropertiesLoaderUtils.loadProperties(resource);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

}
