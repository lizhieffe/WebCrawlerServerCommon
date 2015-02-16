package abstracts;

import utils.StringUtil;
import interfaces.IJobManager;

public abstract class AJob {
	private static int globalCount = 0;
	private int id;
	private IJobManager manager;
	
	public AJob() {
		this.id = globalCount++;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setManager(IJobManager manager) {
		this.manager = manager;
	}
	
	public IJobManager getJobManager() {
		return manager;
	}
	
	@Override
	public String toString() {
		return StringUtil.objToString(this);
	}
}
