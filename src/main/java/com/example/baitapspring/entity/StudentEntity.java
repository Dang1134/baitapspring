package com.example.baitapspring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "students")

public class StudentEntity {
    @Id
    private int id ;

    private String name ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    private String email ;
    private String dob ;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
