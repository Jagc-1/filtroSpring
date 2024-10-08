package com.campus.filtro.persistence.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="medicine")
public class Medicine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_medicine;

    private  String  proceedings;
    private  String namemedicine;  
    private  String healtregister;
    private  String description;
    private  String descriptionshort; 

    @ManyToOne
    @JoinColumn(name="id_codemodeadmin")
    private  ModeAdministration codemodeadmin;

    @ManyToOne
    @JoinColumn(name="id_codeap")
    private  ActivePrinciple codeap;

    @ManyToOne
    @JoinColumn(name="id_codeum")
    private  Unitmeasurement codeum;

    private  String namerol;

    @ManyToOne
    @JoinColumn(name="id_lab")
    private  Labatory lab;

    public Medicine() {
    }

    public Medicine(String proceedings, String namemedicine, String healtregister, String description,
            String descriptionshort, ModeAdministration codemodeadmin, ActivePrinciple codeap, Unitmeasurement codeum,
            String namerol, Labatory lab) {
        this.proceedings = proceedings;
        this.namemedicine = namemedicine;
        this.healtregister = healtregister;
        this.description = description;
        this.descriptionshort = descriptionshort;
        this.codemodeadmin = codemodeadmin;
        this.codeap = codeap;
        this.codeum = codeum;
        this.namerol = namerol;
        this.lab = lab;
    }

    public Integer getId_medicine() {
        return id_medicine;
    }

    public void setId_medicine(Integer id_medicine) {
        this.id_medicine = id_medicine;
    }

    public String getProceedings() {
        return proceedings;
    }

    public void setProceedings(String proceedings) {
        this.proceedings = proceedings;
    }

    public String getNamemedicine() {
        return namemedicine;
    }

    public void setNamemedicine(String namemedicine) {
        this.namemedicine = namemedicine;
    }

    public String getHealtregister() {
        return healtregister;
    }

    public void setHealtregister(String healtregister) {
        this.healtregister = healtregister;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescriptionshort() {
        return descriptionshort;
    }

    public void setDescriptionshort(String descriptionshort) {
        this.descriptionshort = descriptionshort;
    }

    public ModeAdministration getCodemodeadmin() {
        return codemodeadmin;
    }

    public void setCodemodeadmin(ModeAdministration codemodeadmin) {
        this.codemodeadmin = codemodeadmin;
    }

    public ActivePrinciple getCodeap() {
        return codeap;
    }

    public void setCodeap(ActivePrinciple codeap) {
        this.codeap = codeap;
    }

    public Unitmeasurement getCodeum() {
        return codeum;
    }

    public void setCodeum(Unitmeasurement codeum) {
        this.codeum = codeum;
    }

    public String getNamerol() {
        return namerol;
    }

    public void setNamerol(String namerol) {
        this.namerol = namerol;
    }

    public Labatory getLab() {
        return lab;
    }

    public void setLab(Labatory lab) {
        this.lab = lab;
    }

    


}
