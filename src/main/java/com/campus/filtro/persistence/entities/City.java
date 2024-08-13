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
    private Integer codecity;
    private String namecity;

    @ManyToOne
    @JoinColumn(name="coderegion")
    private Region coderegion;

    
    public City() {
    }


    public City(String namecity, Region coderegion) {
        this.namecity = namecity;
        this.coderegion = coderegion;
    }


    public Integer getCodecity() {
        return codecity;
    }


    public void setCodecity(Integer codecity) {
        this.codecity = codecity;
    }


    public String getNamecity() {
        return namecity;
    }


    public void setNamecity(String namecity) {
        this.namecity = namecity;
    }


    public Region getCoderegion() {
        return coderegion;
    }


    public void setCoderegion(Region coderegion) {
        this.coderegion = coderegion;
    }


    

}
