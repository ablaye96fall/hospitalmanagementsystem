package com.hospital.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.hospital.model.Doctor;
import com.hospital.repository.Doctor_Repository;

@Service
public class ServiceDoctor {
	
	@Autowired
	private Doctor_Repository doctor_Repository;
	
 public List<Doctor> getAllDoctor() {
	
				return  doctor_Repository.findAll();
			
 }
 public Doctor getById(long id) {
	 Optional<Doctor> optional = doctor_Repository.findById(id);
	 Doctor doctor=null;
	 if(optional.isPresent()) {
		 doctor=optional.get();
	 }else {
		 throw new RuntimeException("Not found id::" +id);
		 
	 }
	 return doctor;
 }
 public Doctor create(Doctor doctor) {
	 return doctor_Repository.save(doctor);
 }
 public Doctor update(Doctor doctor) {
	 return doctor_Repository.save(doctor);
 }
 
 public void delete(long id) {
	  doctor_Repository.deleteById(id);
 }
}
