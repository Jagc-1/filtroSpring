package com.campus.filtro.persistence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="city")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String codecity;
    private String namecity;

    @ManyToOne
    @JoinColumn(name="codereg")
    private Region codereg;

    
    public City() {
    }


    public City(String namecity, Region codereg) {
        this.namecity = namecity;
        this.codereg = codereg;
    }


    public String getCodecity() {
        return codecity;
    }


    public void setCodecity(String codecity) {
        this.codecity = codecity;
    }


    public String getNamecity() {
        return namecity;
    }


    public void setNamecity(String namecity) {
        this.namecity = namecity;
    }


    public Region getCodereg() {
        return codereg;
    }


    public void setCodereg(Region codereg) {
        this.codereg = codereg;
    }



    

}
