package io.team05.btl.routes;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import io.team05.btl.controller.daoimpl.*;

@RestController
@CrossOrigin
public class SellerController {
    @Autowired
    SellerDAOImpl sellerDaoImpl;
}
