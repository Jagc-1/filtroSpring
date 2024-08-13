package com.campus.filtro.domain.services.Customer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.campus.filtro.domain.repositories.CustomerRepository;
import com.campus.filtro.persistence.entities.Customer;




@Service
public class CustomerImpl implements CustomerService{

   @Autowired
    private CustomerRepository repository;

    @Transactional
    @Override
    public List<Customer> findAll() {
        return(List<Customer>) repository.findAll();
    }

    @Transactional
    @Override
    public Optional<Customer> findById(String codeCustomer) {
       return repository.findById(codeCustomer);
    }

    @Transactional
    @Override
    public Customer save(Customer Customer) {
        return repository.save(Customer);
    }

    @Transactional
    @Override
    public Optional<Customer> update(String codeCustomer, Customer customer) {
       Optional<Customer> CustomerOpt = repository.findById(codeCustomer);
       if(CustomerOpt.isPresent()){
            Customer CustomerItem = CustomerOpt.orElseThrow();
            CustomerItem.setNamecustomer(customer.getNamecustomer());
            CustomerItem.setLastnamecustomer(customer.getLastnamecustomer());
            CustomerItem.setCodecitycustomer(customer.getCodecitycustomer());
            CustomerItem.setEmailcustomer(customer.getEmailcustomer());
            CustomerItem.setBirhdate(customer.getBirhdate());
            CustomerItem.setLon(customer.getLon());
            CustomerItem.setLatitud(customer.getLatitud());
            return Optional.of(repository.save(CustomerItem));
       }
       return CustomerOpt;
    }

    @Transactional
    @Override
    public Optional<Customer> delete(String codeCustomer) {
        Optional<Customer> CustomerOpt = repository.findById(codeCustomer);
        CustomerOpt.ifPresent(CustomerItem ->{
            repository.delete(CustomerItem);
        });
        return CustomerOpt;
    }

}
