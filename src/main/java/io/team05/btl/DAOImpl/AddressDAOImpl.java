package io.team05.btl.DAOImpl;

import io.team05.btl.Repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressDAOImpl {
    @Autowired
    AddressRepository addressRepository;
}
