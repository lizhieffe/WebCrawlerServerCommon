package interfaces;

public interface IThreadPoolDaemon {
	public void start();
	public void stop();
	public void submit(Runnable task);
}
