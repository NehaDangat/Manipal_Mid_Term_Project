package com.hdfc.cilinOPD.Queue.VO;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public class Reminder {

	private int reminderID;
	private int appointmentID;
	private String reminderType; 
	private LocalDate reminderDate;

}
