package io.team05.btl.DAOImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.team05.btl.DAO.ShipmentDAO;
import io.team05.btl.Model.*;
import io.team05.btl.Repository.*;

@Service
public class ShipmentDAOImpl implements ShipmentDAO {
    @Autowired
    ShipmentRepository shipmentRepository;
}
