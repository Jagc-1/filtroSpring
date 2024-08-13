package com.campus.filtro.persistence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="region")
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String codereg;

    private String namereg;

    @ManyToOne
    @JoinColumn(name="codecountry")
    private Country codecountry;


    public Region() {
    }


    public Region(String namereg, Country codecountry) {
        this.namereg = namereg;
        this.codecountry = codecountry;
    }


    public String getCodereg() {
        return codereg;
    }


    public void setCodereg(String codereg) {
        this.codereg = codereg;
    }


    public String getNamereg() {
        return namereg;
    }


    public void setNamereg(String namereg) {
        this.namereg = namereg;
    }


    public Country getCodecountry() {
        return codecountry;
    }


    public void setCodecountry(Country codecountry) {
        this.codecountry = codecountry;
    }

   
    
}
