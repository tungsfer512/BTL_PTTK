package io.team05.btl.routes;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.team05.btl.controller.daoimpl.ShipmentDAOImpl;
import io.team05.btl.model.Seller;
import io.team05.btl.model.Shipment;

@RestController
@CrossOrigin
public class ShipmentController {
	@Autowired
	ShipmentDAOImpl shipmentDAOImpl;
	@PostMapping("/api/shipment/add")
    public Shipment addShipment(@RequestBody Object shipment) {
	 	HashMap<String, String> mp = (HashMap) shipment;
	 	String note = mp.get("note");
	 	String costStr = mp.get("cost");
	 	Double cost = Double.parseDouble(costStr);
	 	String method = mp.get("method");
	 	String address = mp.get("address");
	 	Shipment sm = new Shipment(note, cost, method, address);
	 	return shipmentDAOImpl.addShipment(sm);
    }
}
