package com.mir.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerService {

    private final CustomerRepo customerRepo;

    @Autowired
    public CustomerService( CustomerRepo customerRepo) {
        //@Qualifier("fake")
        this.customerRepo = customerRepo;
    }

    List<Customer> getCustomer() {
        return customerRepo.getCustomers();
    }

}
