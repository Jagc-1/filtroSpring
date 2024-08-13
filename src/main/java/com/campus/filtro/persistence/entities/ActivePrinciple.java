package com.campus.filtro.persistence.entities;

import jakarta.persistence.*;

@Entity
@Table(name="activeprinciple")
public class ActivePrinciple {

     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idap;

    private String nameap;
    
    public ActivePrinciple() {
    }

    public ActivePrinciple(String nameap) {
        this.nameap = nameap;
    }

    public Integer getIdap() {
        return idap;
    }

    public void setIdap(Integer idap) {
        this.idap = idap;
    }

    public String getNameap() {
        return nameap;
    }

    public void setNameap(String nameap) {
        this.nameap = nameap;
    }

    
}
