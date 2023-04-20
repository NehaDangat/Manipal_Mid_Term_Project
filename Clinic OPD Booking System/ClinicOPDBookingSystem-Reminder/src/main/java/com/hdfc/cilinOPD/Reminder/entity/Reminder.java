package com.hdfc.cilinOPD.Reminder.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

@Entity

@Table(name = "reminder")

public class Reminder {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long reminderID;
	private Long appointmentID;
	private String reminderType; 
	private LocalDate reminderDate;


}

