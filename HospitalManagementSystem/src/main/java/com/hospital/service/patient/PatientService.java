package com.hospital.service.patient;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.model.Patient;
import com.hospital.repository.Patient_Repo;

@Service
public class PatientService {
	@Autowired
	 Patient_Repo patient_Repo;
	
	public List<Patient> getAllPatient(){
		return patient_Repo.findAll();
	}
	public Patient getById(long id) {
		Optional<Patient> optional = patient_Repo.findById(id);
		Patient patient=null;
		if(optional.isPresent()) {
			patient=optional.get();
		}else {
			throw new RuntimeException("not found id::" +id);
		}
		return patient;
	}
	public Patient create(Patient patient) {
		return patient_Repo.save(patient);
	}
	public Patient update(Patient patient) {
		return patient_Repo.save(patient);
	}
	public void delete(long id) {
		patient_Repo.deleteById(id);
	}
}
