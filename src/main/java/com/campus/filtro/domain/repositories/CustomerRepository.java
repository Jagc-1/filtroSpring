package com.campus.filtro.domain.repositories;

import org.springframework.data.repository.CrudRepository;

import com.campus.filtro.persistence.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, String>{

}
