package com.campus.filtro.persistence.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "labatory")
public class Labatory {

     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer  id;
    private String namelab;

    @ManyToOne
    @JoinColumn(name = "codecityreg")
    private City codecityreg;

    public Labatory() {
    }

    public Labatory(String namelab, City codecityreg) {
        this.namelab = namelab;
        this.codecityreg = codecityreg;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamelab() {
        return namelab;
    }

    public void setNamelab(String namelab) {
        this.namelab = namelab;
    }

    public City getCodecityreg() {
        return codecityreg;
    }

    public void setCodecityreg(City codecityreg) {
        this.codecityreg = codecityreg;
    }
    
    
}
