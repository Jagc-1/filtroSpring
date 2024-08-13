package com.campus.filtro.persistence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="modeadministration")
public class ModeAdministration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_codemodeadmin;

    private String descriptionmode;

    public ModeAdministration() {
    }

    public ModeAdministration(String descriptionmode) {
        this.descriptionmode = descriptionmode;
    }

    public Integer getId_codemodeadmin() {
        return id_codemodeadmin;
    }

    public void setId_codemodeadmin(Integer id_codemodeadmin) {
        this.id_codemodeadmin = id_codemodeadmin;
    }

    public String getDescriptionmode() {
        return descriptionmode;
    }

    public void setDescriptionmode(String descriptionmode) {
        this.descriptionmode = descriptionmode;
    }

    
}
