package io.team05.btl.controller.dao;

import io.team05.btl.model.Shipment;

public interface ShipmentDAO {
    public Shipment getShipmentByOrderId(Integer id);
    public Shipment getShipmentById(Integer id);
}
