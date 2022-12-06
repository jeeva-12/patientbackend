package com.example.paitent_backend.controller;

import com.example.paitent_backend.dao.PatientDao;
import com.example.paitent_backend.model.Patients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientController {
    @Autowired
    private PatientDao dao;

    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String AddPatient(@RequestBody Patients p){
        System.out.println(p.getPatientName().toString());
        System.out.println(p.getDrName().toString());
        dao.save(p);
        return "Paitent added Successfully";
    }
    @GetMapping("/view")
    public List<Patients> Viewall(){
        return (List<Patients>) dao.findAll();
    }
}
