package com.hdfc.cilinOPD.Reminder.service;

import java.time.LocalDate;
import java.util.List;

import com.hdfc.cilinOPD.Reminder.VO.ReminderAppointment;
import com.hdfc.cilinOPD.Reminder.entity.Reminder;

public interface IReminderService {
	
     public List<Reminder> getAllReminder();
	
	public  Reminder  updateReminder(Reminder reminder);
	
	public Reminder getReminderById(Long  reminderId);
	
	public  ReminderAppointment	getReminderByIdWithAppointment(Long reminderId);
	
	//public String notificationSender(String toEmail ,String body , String subject);

	public String sendMailToAllAppointment(LocalDate date);


}
