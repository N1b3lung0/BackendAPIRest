package com.n1b3lung0.backendapirest.controllers;

import com.n1b3lung0.backendapirest.models.entity.Customer;
import com.n1b3lung0.backendapirest.models.services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/customers/{id}")
    public Customer show(@PathVariable Long id) { return customerService.findById(id); }

    @PostMapping("/customers")
    @ResponseStatus(HttpStatus.CREATED)
    public Customer create(@RequestBody Customer customer) { return customerService.save(customer); }

    @PutMapping("/customers/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Customer update(@RequestBody Customer customer, @PathVariable Long id) {
        Customer currentCustomer = customerService.findById(id);
        currentCustomer.setName(customer.getName());
        currentCustomer.setSurname(customer.getSurname());
        currentCustomer.setEmail(customer.getEmail());
        return customerService.save(currentCustomer);
    }

    @DeleteMapping("customers/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) { customerService.delete(id); }
}
