package io.team05.btl.controller.daoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.team05.btl.controller.dao.ShipmentDAO;
import io.team05.btl.model.Shipment;
import io.team05.btl.repository.ShipmentRepository;

@Service
public class ShipmentDAOImpl implements ShipmentDAO {
    @Autowired
    ShipmentRepository shipmentRepository;

    @Override
    public Shipment getShipmentByOrderId(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Shipment getShipmentById(Integer id) {
        return shipmentRepository.findById(id).get();
    }
    
}
