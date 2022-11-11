package com.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.model.Doctor_Profile;
@Repository
public interface Doctor_Profile_Dao extends JpaRepository<Doctor_Profile, Long> {

}
