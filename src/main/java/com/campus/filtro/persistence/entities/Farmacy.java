package com.campus.filtro.persistence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="farmacy")
public class Farmacy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer  idfarmacy; 

    private  String namefarmacy;   
    private  String lastnamecustomer;   
    private  Integer lon; 
    private  Integer latfarmacy;

    @ManyToOne
    @JoinColumn(name="codecity")
    private  City  codecityfarm; 
    private  String  logofarmacy;

    public Farmacy() {
    }

    public Farmacy(String namefarmacy, String lastnamecustomer, Integer lon, Integer latfarmacy, City codecityfarm,
            String logofarmacy) {
        this.namefarmacy = namefarmacy;
        this.lastnamecustomer = lastnamecustomer;
        this.lon = lon;
        this.latfarmacy = latfarmacy;
        this.codecityfarm = codecityfarm;
        this.logofarmacy = logofarmacy;
    }

    public Integer getIdfarmacy() {
        return idfarmacy;
    }

    public void setIdfarmacy(Integer idfarmacy) {
        this.idfarmacy = idfarmacy;
    }

    public String getNamefarmacy() {
        return namefarmacy;
    }

    public void setNamefarmacy(String namefarmacy) {
        this.namefarmacy = namefarmacy;
    }

    public String getLastnamecustomer() {
        return lastnamecustomer;
    }

    public void setLastnamecustomer(String lastnamecustomer) {
        this.lastnamecustomer = lastnamecustomer;
    }

    public Integer getLon() {
        return lon;
    }

    public void setLon(Integer lon) {
        this.lon = lon;
    }

    public Integer getLatfarmacy() {
        return latfarmacy;
    }

    public void setLatfarmacy(Integer latfarmacy) {
        this.latfarmacy = latfarmacy;
    }

    public City getCodecityfarm() {
        return codecityfarm;
    }

    public void setCodecityfarm(City codecityfarm) {
        this.codecityfarm = codecityfarm;
    }

    public String getLogofarmacy() {
        return logofarmacy;
    }

    public void setLogofarmacy(String logofarmacy) {
        this.logofarmacy = logofarmacy;
    }

   
    
   
    
}
