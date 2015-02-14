package interfaces;

import abstracts.AFutureTaskCallback;

public interface IFutureTask <T> {
//	public void start();
	public void startWithCallback(AFutureTaskCallback <T> task);
}
