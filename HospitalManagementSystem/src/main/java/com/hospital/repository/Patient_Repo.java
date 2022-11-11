package com.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.model.Patient;
@Repository
public interface Patient_Repo extends JpaRepository<Patient, Long>{

}
