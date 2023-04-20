package com.hdfc.cilinOPD.Reminder.DTO;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class ReminderDTO {

	
	private Long reminderID;
	private Long appointmentID;
	private String reminderType; 
	private LocalDate reminderDate;
	

}
