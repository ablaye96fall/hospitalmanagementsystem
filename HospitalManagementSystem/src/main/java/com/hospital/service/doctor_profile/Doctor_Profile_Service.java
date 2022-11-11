package com.hospital.service.doctor_profile;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.model.Doctor_Profile;
import com.hospital.repository.Doctor_Profile_Dao;

@Service
public class Doctor_Profile_Service {
	@Autowired Doctor_Profile_Dao dao;
	
	public List<Doctor_Profile> getAll(){
		return dao.findAll();
	}
	public Doctor_Profile getById(long id) {
		Optional<Doctor_Profile> optional= dao.findById(id);
		Doctor_Profile doctor_Profile=null;
		if(optional.isPresent()) {
			doctor_Profile=optional.get();
		}else {
			throw new RuntimeException("not found by id::" +id);
		}
		return doctor_Profile;
		}
	public Doctor_Profile create(Doctor_Profile doctor_Profile) {
		return dao.save(doctor_Profile);
	}
	public Doctor_Profile update(Doctor_Profile doctor_Profile) {
		return dao.save(doctor_Profile);
	}
	public void delete(long id) {
		dao.deleteById(id);
	}
}
