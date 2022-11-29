package io.team05.btl.controller.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.team05.btl.controller.dao.CartDAO;
import io.team05.btl.model.Cart;
import io.team05.btl.repository.*;

@Service
public class CartDAOImpl implements CartDAO {
    @Autowired
    CartRepository cartRepository;

    @Override
    public List<Cart> getAllCartByCustomerId(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }
}
