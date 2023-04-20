package com.hdfc.cilinOPD.appointment.DTO;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class AppointmentDTO {

  private Long appointmentId;
	
	
    private LocalDate date;
	
 
    private LocalTime time;
    
    
   
    private  String  status  ;
    
    private Long doctorId;
    
    private Long patientId;
	
}
