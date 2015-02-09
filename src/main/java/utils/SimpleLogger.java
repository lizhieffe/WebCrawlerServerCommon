package utils;

import org.apache.log4j.Logger;

import interfaces.IService;

public class SimpleLogger {
	
	public static void info(String message) {
		Logger.getLogger("").info("[" + TimeUtil.getUnixTime() + "] " + message);
	}
	
	public static void info(Class<?> cla, String message) {
		Logger.getLogger(cla).info("[" + TimeUtil.getUnixTime() + "] " + message);
	}
	
	public static void logServiceStartSucceed(String service) {
        info(service + " starts successfully");
	}
	
	public static void logServiceStartSucceed(IService service) {
		logServiceStartSucceed(service.getClass().getName());
	}
	
	public static void logServiceStartFail(String service) {
        info(service + " starts failed");
	}
	
	public static void logServiceStartFail(IService service) {
		logServiceStartFail(service.getClass().getName());
	}
	
	public static void logServiceAlreadyStarted(String service) {
        info(service + " has already started");
	}
	
	public static void logServiceAlreadyStarted(IService service) {
		logServiceAlreadyStarted(service.getClass().getName());
	}
	
	public static void logServiceStopSucceed(String service) {
        info(service + " stops successfully");
	}
	
	public static void logServiceStopSucceed(IService service) {
		logServiceStopSucceed(service.getClass().getName());
	}
	
	public static void logServiceStopFail(String service) {
        info(service + " stops failed");
	}
	
	public static void logServiceStopFail(IService service) {
		logServiceStopFail(service.getClass().getName());
	}
}
