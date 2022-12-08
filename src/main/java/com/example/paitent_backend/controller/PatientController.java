package com.example.paitent_backend.controller;

import com.example.paitent_backend.dao.PatientDao;
import com.example.paitent_backend.model.Patients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

    @RestController
    public class PatientController {
    @Autowired
    private PatientDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addpat",consumes = "application/json",produces = "application/json")
    public String AddPatient(@RequestBody Patients p){
        System.out.println(p.getPatientName().toString());
        System.out.println(p.getDrName().toString());
        dao.save(p);
        return "Patient added Successfully";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Patients> Viewall(){
        return (List<Patients>) dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/search",consumes ="application/json",produces = "application/json")
    public List<Patients> SearchPatient(@RequestBody  Patients p) {
            String patientName  =p.getPatientName ().toString();
            System.out.println(patientName);
            return (List<Patients>) dao.SearchPatient(p.getPatientName());
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/delete",consumes = "application/json",produces = "application/json")
    public HashMap<String,String> DeletePatient(@RequestBody Patients p) {
            String id=String.valueOf(p.getId());
            System.out.println(id);
            dao.DeletePatient(p.getId());
            HashMap<String,String> map = new HashMap<>();
            map.put("status","success");
            return map;

        }
}
