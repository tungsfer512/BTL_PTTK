package io.team05.btl.controller.daoimpl;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.team05.btl.controller.dao.*;
import io.team05.btl.model.*;
import io.team05.btl.repository.*;

@Service
public class AddressDAOImpl implements AddressDAO {
    @Autowired
    AddressRepository addressRepository;
    @Autowired
    UserRepository userRepository;

    @Override
    public Address getAddressByUserId(Integer id) {
        User user = userRepository.findById(id).get();
        Address address = user.getAddress();
        return address;
    }

    @Override
    public List<Address> groupCutstomerByAddressId(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Address> groupSellerByAddressId(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }
}
