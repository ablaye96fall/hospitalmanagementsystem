package com.hospital.controller;




import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.model.Doctor;

import com.hospital.service.ServiceDoctor;


@CrossOrigin(origins ="*" )
@RestController
@RequestMapping("/doctors")
public class Doctor_Controller {
	
	@Autowired
			private ServiceDoctor serviceDoctor;
			
		
	@GetMapping()
	public List<Doctor> getAllDoctor(){
		
		return serviceDoctor.getAllDoctor();
	}
	
	@PostMapping()
	public Doctor create(@RequestBody Doctor doctor) {
		return serviceDoctor.create(doctor);
	}
	@GetMapping("/{id}")
	public Doctor getById(@PathVariable long id) {
		return serviceDoctor.getById(id);
	}
	@PutMapping()
	public Doctor update(@RequestBody Doctor doctordetails){
		return serviceDoctor.update(doctordetails);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		serviceDoctor.delete(id);
	}
	
	
}
