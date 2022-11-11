package com.hospital.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="doctor_profile")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Doctor_Profile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String name;
	
	private String dateofbirth;
	
	private String photograph;
	
	private String email;
	
	private long contact_number;
	
	private String qualification;
	
	private String gender;
}
