package com.n1b3lung0.backendapirest.models.services;

import com.n1b3lung0.backendapirest.models.entity.Customer;

import java.util.List;
import java.util.Optional;

public interface ICustomerService {

    public List<Customer> findAll();

    public Customer findById(Long id);

    public Customer save(Customer customer);

    public void delete(Long id);
}
