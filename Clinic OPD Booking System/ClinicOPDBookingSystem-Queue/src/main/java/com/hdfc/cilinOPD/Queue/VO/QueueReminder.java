package com.hdfc.cilinOPD.Queue.VO;

import com.hdfc.cilinOPD.Queue.entity.Queue;

public class QueueReminder {
	
     private Queue queue;
	
	private Reminder reminder;

	public QueueReminder() {
		super();
		
	}

	public QueueReminder(Queue queue, Reminder reminder) {
		super();
		this.queue = queue;
		this.reminder = reminder;
	}

	public Queue getQueue() {
		return queue;
	}

	public void setQueue(Queue queue) {
		this.queue = queue;
	}

	public Reminder getReminder() {
		return reminder;
	}

	public void setReminder(Reminder reminder) {
		this.reminder = reminder;
	}
	
	


}
