package io.team05.btl.routes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.team05.btl.controller.daoimpl.AddressDAOImpl;
import io.team05.btl.model.Address;

@RestController
@CrossOrigin
public class AddressController {
    @Autowired
    AddressDAOImpl addressDAOImpl;

    @GetMapping("/api/addresses/user/{id}")
    public Address getAddressByUser(@PathVariable Integer id) {
        return addressDAOImpl.getAddressByUserId(id);
    }

    
}
