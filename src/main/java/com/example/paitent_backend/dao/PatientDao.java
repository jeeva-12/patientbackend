package com.example.paitent_backend.dao;

import com.example.paitent_backend.model.Patients;
import org.springframework.data.repository.CrudRepository;

public interface PatientDao extends CrudRepository<Patients,Integer> {
}
