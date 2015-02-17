package com.zl.abstracts;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;
import com.zl.interfaces.IFutureTask;

abstract public class AFutureTask <T> implements IFutureTask <T> {
	
	protected Callable <T> callable;
	protected static ListeningExecutorService service;
	
	static {
		service = MoreExecutors.listeningDecorator(Executors.newFixedThreadPool(10));
	}
	
	public AFutureTask() {
	}
	
//	@Override
//	public void start() {
//		Future<T> future = es.submit(callable);
//		try {
//			future.get();
//		} catch (InterruptedException | ExecutionException e) {
//		}
//	}
	
	@Override
	public void startWithCallback(AFutureTaskCallback <T> callback) {
		ListenableFuture<T> future = service.submit(this.callable);
		Futures.addCallback(future, callback);
	}
}
