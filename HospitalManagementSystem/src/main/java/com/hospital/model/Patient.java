package com.hospital.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="patient")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString

public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String name;
	private long contact_number;
	private String dateofbirth; 
	private String blood_group;
	private String email;
	private String address;
	private String gender;
	private String photograph;

}
