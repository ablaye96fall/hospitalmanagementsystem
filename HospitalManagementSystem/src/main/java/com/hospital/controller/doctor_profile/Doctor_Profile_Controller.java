package com.hospital.controller.doctor_profile;

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

import com.hospital.model.Doctor_Profile;
import com.hospital.repository.Doctor_Profile_Dao;
import com.hospital.service.doctor_profile.Doctor_Profile_Service;
@RestController
@CrossOrigin(origins ="*" )
@RequestMapping("/doctor_profile")
public class Doctor_Profile_Controller {
	@Autowired Doctor_Profile_Service doctor_Profile_Service;
	@Autowired Doctor_Profile_Dao dao;
	
	@GetMapping()
	public List<Doctor_Profile> GetAllProfileDoc(){
		return doctor_Profile_Service.getAll();
	}
	@GetMapping("/{id}")
	public Doctor_Profile getById(@PathVariable long id) {
		return doctor_Profile_Service.getById(id);
	}
	@PostMapping()
	public Doctor_Profile create(@RequestBody Doctor_Profile doctor_Profile) {
		return doctor_Profile_Service.create(doctor_Profile);
	}
	@PutMapping("/{id}")
	public ResponseEntity<Doctor_Profile>  update(@PathVariable long id , @RequestBody Doctor_Profile doctor_Profile_details) {
		
		Doctor_Profile doctor_Profile =  doctor_Profile_Service.getById(id);
		doctor_Profile.setName(doctor_Profile_details.getName());
		doctor_Profile.setContact_number(doctor_Profile_details.getContact_number());
		doctor_Profile.setDateofbirth(doctor_Profile_details.getDateofbirth());
		doctor_Profile.setEmail(doctor_Profile_details.getEmail());
		doctor_Profile.setQualification(doctor_Profile_details.getQualification());
		doctor_Profile.setGender(doctor_Profile_details.getGender());
		doctor_Profile.setPhotograph(doctor_Profile_details.getPhotograph());
		
		 Doctor_Profile updateDoctorProfile = doctor_Profile_Service.update(doctor_Profile);
		 return ResponseEntity.ok(updateDoctorProfile);
		
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		doctor_Profile_Service.delete(id);
	}

}
