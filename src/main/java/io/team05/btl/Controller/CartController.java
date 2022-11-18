package io.team05.btl.Controller;

import io.team05.btl.Model.*;
import io.team05.btl.Service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class CartController {
    @Autowired
    CartService cartService;
}
