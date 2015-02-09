package interfaces;

public interface IThreadPoolService {
	public void start();
	public void stop();
	public void submit(Runnable task);
}
