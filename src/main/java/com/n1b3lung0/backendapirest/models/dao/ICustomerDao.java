package com.n1b3lung0.backendapirest.models.dao;

import com.n1b3lung0.backendapirest.models.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface ICustomerDao extends CrudRepository<Customer, Long> {

}
