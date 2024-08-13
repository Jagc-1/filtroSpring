package com.campus.filtro.persistence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="farmacymedicine")
public class FarmacyMedicine {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_farmacymedicine;

    @ManyToOne
    @JoinColumn(name ="idfarmacy")
    private  Farmacy idfarmacy; 

    @ManyToOne
    @JoinColumn(name ="id_medicine")
    private  Medicine medicine;

    private  Integer price;

    public FarmacyMedicine() {
    }

    public FarmacyMedicine(Farmacy idfarmacy, Medicine medicine, Integer price) {
        this.idfarmacy = idfarmacy;
        this.medicine = medicine;
        this.price = price;
    }

    public Integer getId_farmacymedicine() {
        return id_farmacymedicine;
    }

    public void setId_farmacymedicine(Integer id_farmacymedicine) {
        this.id_farmacymedicine = id_farmacymedicine;
    }

    public Farmacy getIdfarmacy() {
        return idfarmacy;
    }

    public void setIdfarmacy(Farmacy idfarmacy) {
        this.idfarmacy = idfarmacy;
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

   
   
   


}
