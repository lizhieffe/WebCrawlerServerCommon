package com.zl.interfaces;

import com.zl.abstracts.AJob;

public interface IJobManager {
	public abstract boolean addJob(AJob job);
	public abstract boolean moveJobToWaitingStatus(AJob job);
	public abstract boolean moveJobToRunningStatus(AJob job);
	
//	public abstract List<AJob> getWaitingJobs();
//	public abstract List<AJob> getRunningJobs();
//	public boolean hasJobWaiting();
//	public boolean hasJobRunning();
}
