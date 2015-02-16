package abstracts;

import com.zl.interfaces.IJobManager;

import utils.StringUtil;

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
