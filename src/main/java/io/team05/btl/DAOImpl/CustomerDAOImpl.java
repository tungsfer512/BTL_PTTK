package io.team05.btl.DAOImpl;

import org.springframework.beans.factory.annotation.Autowired;

import io.team05.btl.Repository.CustomerRepository;

public class CustomerDAOImpl {
    @Autowired
    CustomerRepository customerRepository;
}
