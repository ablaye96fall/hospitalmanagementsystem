package com.hospital.controller.patient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.hospital.model.Patient;
import com.hospital.service.patient.PatientService;
@CrossOrigin(origins ="*" )
@RestController
@RequestMapping("/patients")
public class PatientController {
	@Autowired
	PatientService patientService;
	
	@GetMapping()
	public List<Patient> getAllDoctor(){
		return patientService.getAllPatient();
	}
	
	@PostMapping()
	public Patient create(@RequestBody Patient patient) {
		return patientService.create(patient);
	}
	@GetMapping("/{id}")
	public Patient getById(@PathVariable long id) {
		return patientService.getById(id);
	}
	@PutMapping("/{id}")
	public ResponseEntity<Patient> update(@PathVariable long id,@RequestBody Patient patientdetails){
		Patient patient = patientService.getById(id);
		patient.setName(patientdetails.getName());
		patient.setGender(patientdetails.getGender());
		patient.setAddress(patientdetails.getAddress());
		patient.setBlood_group(patientdetails.getBlood_group());
		patient.setContact_number(patientdetails.getContact_number());
		patient.setDateofbirth(patientdetails.getDateofbirth());
		patient.setPhotograph(patientdetails.getPhotograph());
		
		Patient updatePatient=patientService.update(patient);
		return ResponseEntity.ok(updatePatient);
		
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		patientService.delete(id);
	}

}
