package com.mir.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
