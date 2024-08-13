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
    private Integer coderegion;

    private String nameregion;

    @ManyToOne
    @JoinColumn(name="id_codecountry ")
    private Country codecountry;


    public Region() {
    }


    public Integer getId_coderegion() {
        return coderegion;
    }


    public void setId_coderegion(Integer coderegion) {
        this.coderegion = coderegion;
    }


    public String getNameregion() {
        return nameregion;
    }


    public void setNameregion(String nameregion) {
        this.nameregion = nameregion;
    }


    public Country getCodecountry() {
        return codecountry;
    }


    public void setCodecountry(Country codecountry) {
        this.codecountry = codecountry;
    }

}
