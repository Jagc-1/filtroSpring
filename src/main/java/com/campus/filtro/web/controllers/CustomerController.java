package com.campus.filtro.web.controllers;

import java.util.HashMap;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


import com.campus.filtro.domain.services.Customer.CustomerService;
import com.campus.filtro.persistence.entities.Customer;


import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @GetMapping
    public List<Customer> getAllCustomers() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable String idcustomer) {
        Optional<Customer> customerOpt = service.findById(idcustomer);
        if (customerOpt.isPresent()) {
            return ResponseEntity.ok(customerOpt.orElseThrow());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
public ResponseEntity<?> crear(@Valid
@RequestBody Customer customer, BindingResult resultado) {
    if (resultado.hasFieldErrors()) {
        return validar(resultado);
    }
    return ResponseEntity.status(HttpStatus.CREATED).body(service.save(customer));
}


@PutMapping("/{id}")
public ResponseEntity<?> actualizar(@Valid
@RequestBody Customer customer, BindingResult resultado, @PathVariable String idcustomer) {
    if (resultado.hasFieldErrors()) {
        return validar(resultado);
    }
    Optional<Customer> estadoOpt = service.update(idcustomer, customer);
    if (estadoOpt.isPresent()) {
        return ResponseEntity.ok(estadoOpt.orElseThrow());
    }
    return ResponseEntity.notFound().build();
}




        @DeleteMapping("/{id}")
    public ResponseEntity<Customer> eliminar(@PathVariable String idcustomer) {
        Optional<Customer> customerOpt = service.delete(idcustomer);
        if (customerOpt.isPresent()) {
            return ResponseEntity.ok(customerOpt.orElseThrow());
        }
        return ResponseEntity.notFound().build();
    }



    private ResponseEntity<?> validar(BindingResult resultado) {
        Map<String, String> errores = new HashMap<>();
        resultado.getFieldErrors().forEach(err -> {
            errores.put(err.getField(), "El campo " + err.getField() + " " + err.getDefaultMessage());
        });
        return ResponseEntity.badRequest().body(errores);
    }
    
}




