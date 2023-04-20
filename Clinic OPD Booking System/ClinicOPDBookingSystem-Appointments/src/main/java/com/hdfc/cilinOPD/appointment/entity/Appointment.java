package com.hdfc.cilinOPD.appointment.entity;


import java.net.URI;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

@Entity
@Table(name ="appointment")
public class Appointment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long appointmentId;
	
	@NotNull(message = "Date is mandatory")
    
    private LocalDate date;
	
    @NotNull(message = "Time is mandatory")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private LocalTime time;
    
    
   
    private  String  status  ;
    
    private Long doctorId;
    
    private Long patientId;

	public URI getUri() {
		// TODO Auto-generated method stub
		return null;
	}
    
    /*
   @OneToOne
   @JoinColumn(name = "doctorId")
    private  Doctor doctor;
    
    
  @OneToOne
  @JoinColumn(name = "patientId")
    private Patient patient;
    */
    
    
}
