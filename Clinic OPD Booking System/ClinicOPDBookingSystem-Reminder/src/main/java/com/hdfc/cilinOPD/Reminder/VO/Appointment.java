package com.hdfc.cilinOPD.Reminder.VO;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public class Appointment {

	private Long appointmentId;
    private LocalDate date;
    private LocalTime time;
    private  String  status;
    private Long doctorId;
    private Long patientId;
    
}
