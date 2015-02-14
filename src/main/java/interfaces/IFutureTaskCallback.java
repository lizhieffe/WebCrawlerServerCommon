package interfaces;

public interface IFutureTaskCallback <T> {
	public void onFinish(T result);
	public void onInterrupted(Throwable thrown);
}
