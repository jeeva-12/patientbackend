package com.example.paitent_backend.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Patients")
public class Patients {
    @Id
    @GeneratedValue
    private int id;
    private String patientName;
    private String address;
    private String mobile;
    private int age;
    private String drName;

    public Patients() {
    }

    public Patients(int id, String patientName, String address, String mobile, int age, String drName) {
        this.id = id;
        this.patientName = patientName;
        this.address = address;
        this.mobile = mobile;
        this.age = age;
        this.drName = drName;


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDrName() {
        return drName;
    }

    public void setDrName(String drName) {
        this.drName = drName;
    }
}
