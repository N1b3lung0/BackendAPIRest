package com.n1b3lung0.backendapirest.controllers;

import com.n1b3lung0.backendapirest.models.entity.Customer;
import com.n1b3lung0.backendapirest.models.services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class CustomerRestController {

    @Autowired
    private ICustomerService customerService;

    @GetMapping("/customers")
    public List<Customer> index() {
        return customerService.findAll();
    }
}
