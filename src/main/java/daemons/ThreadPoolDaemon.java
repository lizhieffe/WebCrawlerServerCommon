package daemons;

import interfaces.IThreadPoolDaemon;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import utils.SimpleLogger;

public class ThreadPoolDaemon implements IThreadPoolDaemon {
	private static ThreadPoolDaemon instance;
	private ExecutorService es;
	
	private ThreadPoolDaemon() {
		es = Executors.newCachedThreadPool();
	}
	
	public static ThreadPoolDaemon getInstance() {
		if (instance == null)
			instance = new ThreadPoolDaemon();
		return instance;
	}
	
	public void submit(Runnable task) {
		this.es.submit(task);
	}
	
	public void start() {
		es = Executors.newFixedThreadPool(50);
		SimpleLogger.logServiceStartSucceed(this.getClass().getName());
	}
	
	public void stop() {
		es.shutdownNow();
		if (es.isShutdown())
			SimpleLogger.logServiceStopSucceed(this.getClass().getName());
		else
			SimpleLogger.logServiceStopFail(this.getClass().getName());
	}
}
