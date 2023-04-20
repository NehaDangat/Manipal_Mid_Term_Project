package com.hdfc.cilinOPD.Schedule.DTO;

import java.sql.Time;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter


public class ScheduleDTO {

	private long scheduleId;
	private long doctorId;
	private String dayOfWeek;
	private Time timeSlot;
	private boolean availability;
	
}
