package com.campus.filtro.persistence.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "unitmeasurement")
public class Unitmeasurement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idum;

    private String nameum;

    public Unitmeasurement() {
    }

    public Unitmeasurement(String nameum) {
        this.nameum = nameum;
    }

    public Integer getIdum() {
        return idum;
    }

    public void setIdum(Integer idum) {
        this.idum = idum;
    }

    public String getNameum() {
        return nameum;
    }

    public void setNameum(String nameum) {
        this.nameum = nameum;
    }

    
}
