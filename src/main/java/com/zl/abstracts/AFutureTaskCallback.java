package com.zl.abstracts;

import com.google.common.util.concurrent.FutureCallback;
import com.zl.utils.SimpleLogger;

public class AFutureTaskCallback<T> implements FutureCallback<T> {
	@Override
	public void onSuccess(T result) {
		SimpleLogger.info("FutureCallback.onSuccess(T) is being called");
	}
	
	@Override
	public void onFailure(Throwable thrown) {
		SimpleLogger.info("FutureCallback.onFailure(Throwable) is being called");
	}
}
