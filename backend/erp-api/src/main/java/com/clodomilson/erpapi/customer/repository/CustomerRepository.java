package com.clodomilson.erpapi.customer.repository;

import com.clodomilson.erpapi.customer.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository
        extends JpaRepository<Customer, Long> {

}