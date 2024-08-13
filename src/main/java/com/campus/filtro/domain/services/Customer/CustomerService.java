package com.campus.filtro.domain.services.Customer;

import java.util.List;
import java.util.Optional;

import com.campus.filtro.persistence.entities.Customer;


public interface CustomerService {
    List<Customer> findAll();
    Optional<Customer> findById(String  idcustomer);
    Customer save(Customer customer);
    Optional<Customer> update(String  idcustomer, Customer customer);
    Optional<Customer> delete(String  idcustomer);
}
