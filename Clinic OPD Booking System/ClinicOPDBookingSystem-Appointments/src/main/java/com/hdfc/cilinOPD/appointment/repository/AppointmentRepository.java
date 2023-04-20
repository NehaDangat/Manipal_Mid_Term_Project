package com.hdfc.cilinOPD.appointment.repository;



import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hdfc.cilinOPD.appointment.DTO.AppointmentDTO;
import com.hdfc.cilinOPD.appointment.entity.Appointment;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment ,Long> {

	public Appointment save(AppointmentDTO appointment);

	public List<Appointment> findByPatientId(Long patientId);

	public List<Appointment> findByDoctorId(Long doctorId);

	public List<Appointment> findByDateGreaterThanEqualOrderByDateAsc(Date currentDate);

	public List<Appointment> findByDateGreaterThanEqualOrderByDateAsc(LocalDate currentDate);

	//public List<Appointment> findByDoctorIdAndDate(Long doctorId, LocalDate date);

	//public List<Appointment> findByPatientId(Long patientId);

	//public List<Appointment> findByDoctorAndAppointmentTimeBetween(Doctor doctor, LocalDateTime start,LocalDateTime end);

}
