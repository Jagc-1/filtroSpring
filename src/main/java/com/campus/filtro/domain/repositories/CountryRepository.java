package com.campus.filtro.domain.repositories;

import org.springframework.data.repository.CrudRepository;

import com.campus.filtro.persistence.entities.Country;


public interface CountryRepository extends CrudRepository<Country, String>{

}
