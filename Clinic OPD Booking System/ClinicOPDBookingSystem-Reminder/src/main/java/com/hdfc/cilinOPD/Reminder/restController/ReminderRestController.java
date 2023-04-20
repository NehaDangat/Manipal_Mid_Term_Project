package com.hdfc.cilinOPD.Reminder.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdfc.cilinOPD.Reminder.VO.ReminderAppointment;
import com.hdfc.cilinOPD.Reminder.entity.Reminder;
import com.hdfc.cilinOPD.Reminder.service.IReminderService;

@RestController
@RequestMapping("/remainder")
public class ReminderRestController {
	
	@Autowired
	IReminderService service;
	
	@GetMapping("/getall")
	public List<Reminder> getAllReminder(){
		
		return service.getAllReminder();
		
	}
	
@PutMapping("/update")
	
	public  Reminder  updateReminder(@RequestBody Reminder reminder) {
		
		return service.updateReminder(reminder);
	}

@GetMapping("/get/{reminderId}")
public Reminder getReminderById(@PathVariable Long reminderId) {
	
	return service.getReminderById(reminderId);
}

@GetMapping("/get/remwithapp/{reminderId}")
public  ReminderAppointment	getremByIdWithapp(@PathVariable  Long reminderId) {
	
	return service.getReminderByIdWithAppointment(reminderId);
	
}





}
