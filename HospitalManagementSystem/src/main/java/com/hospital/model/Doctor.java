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
@Table(name = "doctor_info")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Doctor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long doctor_id;
	
	private String imageURL;
	private String doctor_name;
	
	private String doctor_education;
	
	private String doctor_speciality;
	
	private  String appointement_date;
	
	private String appointement_day;
	
	private String available_time;
	
	
	private String patient_name;
	
	private String patient_age;
	
	private String patient_blood_group;
	
	
	
	
	

}
