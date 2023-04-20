package com.hdfc.cilinOPD.Doctor.VO;

import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter


public class Schedule {
	
	private long scheduleId;
	private long doctorId;
	private String dayOfWeek;
	private Time timeSlot;
	private Boolean availability;
	
	

	

	

	
}
