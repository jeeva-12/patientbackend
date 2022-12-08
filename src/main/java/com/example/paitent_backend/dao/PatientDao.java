package com.example.paitent_backend.dao;

import com.example.paitent_backend.model.Patients;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PatientDao extends CrudRepository<Patients,Integer> {
    @Query(value = "SELECT `id`, `address`, `age`, `dr_name`, `mobile`, `patient_name` FROM `patients` WHERE `patient_name`=:patientName", nativeQuery = true)
    List<Patients> SearchPatient(@Param("patientName") String patientName);


    @Modifying
    @Transactional
    @Query(value = "DELETE FROM `patients` WHERE `id`=:id", nativeQuery = true)
    void DeletePatient(@Param("id")Integer id);
}