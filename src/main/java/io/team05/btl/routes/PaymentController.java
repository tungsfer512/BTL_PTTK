package io.team05.btl.routes;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.team05.btl.controller.daoimpl.PaymentDAOImpl;
import io.team05.btl.controller.daoimpl.ShipmentDAOImpl;
import io.team05.btl.model.Payment;
import io.team05.btl.model.Shipment;

@RestController
@CrossOrigin
public class PaymentController {
	@Autowired
	PaymentDAOImpl paymentDAOImpl;

	@Autowired
	ShipmentDAOImpl shipmentDAOImpl;
	@PostMapping("/api/payment/add")
	public Payment addPayment(@RequestBody Object payment) {
		HashMap<String, String> pm = (HashMap) payment;
	 	String card = pm.get("card");
	 	Double amount = Double.parseDouble(pm.get("amount"));
	 	String cvv = pm.get("cvv");
	 	String method = pm.get("method");
	 	Integer shipment_id = Integer.parseInt(pm.get("shipment_id"));
	 	Shipment shipment = shipmentDAOImpl.getShipmentById(shipment_id);
	 	Payment paymentAdd = new Payment(amount, card, cvv, method, shipment);
	 	return paymentDAOImpl.addPayment(paymentAdd);
	}
}
