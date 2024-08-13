package com.campus.filtro.persistence.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {

     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer  idcustomer; 
    private  String namecustomer;   
    private  String lastnamecustomer;   


    @ManyToOne
    @JoinColumn(name="codecitycustomer")
    private  City  codecitycustomer; 
    private  String  emailcustomer; 
    private  Date  birhdate; 
    private  Integer lon; 
    private  Integer latitud;

    public Customer() {
    }

    public Customer(String namecustomer, String lastnamecustomer, City codecitycustomer, String emailcustomer,
            Date birhdate, Integer lon, Integer latitud) {
        this.namecustomer = namecustomer;
        this.lastnamecustomer = lastnamecustomer;
        this.codecitycustomer = codecitycustomer;
        this.emailcustomer = emailcustomer;
        this.birhdate = birhdate;
        this.lon = lon;
        this.latitud = latitud;
    }

    public Integer getIdcustomer() {
        return idcustomer;
    }

    public void setIdcustomer(Integer idcustomer) {
        this.idcustomer = idcustomer;
    }

    public String getNamecustomer() {
        return namecustomer;
    }

    public void setNamecustomer(String namecustomer) {
        this.namecustomer = namecustomer;
    }

    public String getLastnamecustomer() {
        return lastnamecustomer;
    }

    public void setLastnamecustomer(String lastnamecustomer) {
        this.lastnamecustomer = lastnamecustomer;
    }

    public City getCodecitycustomer() {
        return codecitycustomer;
    }

    public void setCodecitycustomer(City codecitycustomer) {
        this.codecitycustomer = codecitycustomer;
    }

    public String getEmailcustomer() {
        return emailcustomer;
    }

    public void setEmailcustomer(String emailcustomer) {
        this.emailcustomer = emailcustomer;
    }

    public Date getBirhdate() {
        return birhdate;
    }

    public void setBirhdate(Date birhdate) {
        this.birhdate = birhdate;
    }

    public Integer getLon() {
        return lon;
    }

    public void setLon(Integer lon) {
        this.lon = lon;
    }

    public Integer getLatitud() {
        return latitud;
    }

    public void setLatitud(Integer latitud) {
        this.latitud = latitud;
    }

    
    
}
