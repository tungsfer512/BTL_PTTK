package io.team05.btl.DAOImpl;

import io.team05.btl.Repository.ShipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShipmentDAOImpl {
    @Autowired
    ShipmentRepository shipmentRepository;
}
