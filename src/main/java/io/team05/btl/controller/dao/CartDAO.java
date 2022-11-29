package io.team05.btl.controller.dao;

import java.util.List;

import io.team05.btl.model.Cart;

public interface CartDAO {
    public List<Cart> getAllCartByCustomerId(Integer id);
}
