package com.example.aravind.huhu;

/**
 * Created by aravind on 02/03/16.
 */
public class Report {
    private String hospital_name, doctor_name, date;

    public Report() {
    }

    public Report(String hospital_name, String doctor_name, String date) {
        this.hospital_name = hospital_name;
        this.doctor_name = doctor_name;
        this.date = date;
    }

    public String getHospital_name() {
        return hospital_name;
    }

    public void setHospital_name(String hospital_name) {
        this.hospital_name = hospital_name;
    }

    public String getDoctor_name() {
        return date;
    }

    public void setDoctor_name(String doctor_name) {
        this.date = doctor_name;
    }

    public String getDate() {
        return doctor_name;
    }

    public void setDate(String date) {
        this.doctor_name = date;
    }
}
