package com.hdfc.cilinOPD.Reminder.VO;

import com.hdfc.cilinOPD.Reminder.entity.Reminder;

public class ReminderAppointment {
	
	private Reminder remainder;
	private Appointment appointments;
	
	
	public ReminderAppointment() {
		super();
		
	}


	public ReminderAppointment(Reminder remainder, Appointment appointments) {
		super();
		this.remainder = remainder;
		this.appointments = appointments;
	}


	public Reminder getRemainder() {
		return remainder;
	}


	public void setRemainder(Reminder remainder) {
		this.remainder = remainder;
	}


	public Appointment getAppointments() {
		return appointments;
	}


	public void setAppointments(Appointment appointments) {
		this.appointments = appointments;
	}


}
