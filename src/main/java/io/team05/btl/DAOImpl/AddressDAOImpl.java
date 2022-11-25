package io.team05.btl.DAOImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.team05.btl.DAO.AddressDAO;
import io.team05.btl.Model.*;
import io.team05.btl.Repository.*;

@Service
public class AddressDAOImpl implements AddressDAO {
    @Autowired
    AddressRepository addressRepository;
}
