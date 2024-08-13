
package com.campus.filtro.persistence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="country")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codecountry;
    
    private String namecountry;

    public Country() {
    }
    
    public Country(String namecountry) {
        this.namecountry = namecountry;
    }

    public Integer getCodecountry() {
        return codecountry;
    }

    public void setCodecountry(Integer codecountry) {
        this.codecountry = codecountry;
    }

    public String getNamecountry() {
        return namecountry;
    }

    public void setNamecountry(String namecountry) {
        this.namecountry = namecountry;
    }

}
