package com.hdfc.cilinOPD.Patient.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.hdfc.cilinOPD.Patient.VO.Appointment;
import com.hdfc.cilinOPD.Patient.VO.Doctor;
import com.hdfc.cilinOPD.Patient.entity.Patient;
import com.hdfc.cilinOPD.Patient.exception.PatientNotFound;
import com.hdfc.cilinOPD.Patient.repository.PatientRepository;
import com.hdfc.cilinOPD.PatientDTO.PatientDTO;

@Service
public class PatientServiceImp implements IPatientService {

	@Autowired
	PatientRepository repo;
	
	@Autowired
	RestTemplate restTemplate;
	
	
	@Override
	public Patient addPatient(PatientDTO Pdto)  {
		
		Patient patient = new Patient();
		
		patient.setPatientId(Pdto.getPatientId());
		patient.setFirstName(Pdto.getFirstName());
		patient.setLastName(Pdto.getLastName());
		patient.setContact(Pdto.getContact());
		patient.setMedicalHistory(Pdto.getMedicalHistory());
		patient.setInsuranceDetails(Pdto.getInsuranceDetails());
		
		return repo.save(patient);
	}

	@Override
	public Patient updatePatient(Patient Pdto) {
		
		Optional<Patient> opt = repo.findById(Pdto.getPatientId());
		
		if(opt.isPresent())
		{
			return repo.save(Pdto);
		}
		return Pdto;
		
      
	}

	@Override
	public Patient getByPatientId(long patientId) throws PatientNotFound {
		
		return repo.findById(patientId).orElseThrow(() -> new PatientNotFound());
	}


	@Override
	public void deletePatient(long patientId) throws PatientNotFound {
     
			repo.deleteById(patientId);
		
	}

	@Override
	public List<Doctor> getDoctorInfoToPatient()  {
		
	  List<Doctor> doctor = restTemplate.getForObject("http://localhost:2001/doctor/getAll",List.class);
		
		return doctor;
	}

	@Override
	public Appointment bookAppointment(Appointment appointment) {
		
		Appointment appointment1 = restTemplate.postForObject("http://localhost:2003/api/appointment/add",appointment, Appointment.class);
		
				return appointment1;
	}

	@Override
	public List<Appointment> viewMyAppointments(long patientId) {
		
		List<Appointment> appointments = restTemplate.getForObject("http://localhost:2003/api/appointment/getAppointmentsByPatientAndDateRange"+patientId,List.class);
		
		return appointments;
	}

}


