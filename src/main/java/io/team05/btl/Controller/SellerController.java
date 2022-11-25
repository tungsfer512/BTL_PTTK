package io.team05.btl.Controller;

import io.team05.btl.DAOImpl.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class SellerController {
    @Autowired
    SellerDAOImpl sellerDaoImpl;
}
