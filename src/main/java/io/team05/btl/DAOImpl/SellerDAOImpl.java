package io.team05.btl.DAOImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.team05.btl.DAO.SellerDAO;
import io.team05.btl.Model.*;
import io.team05.btl.Repository.*;

@Service
public class SellerDAOImpl implements SellerDAO {
    @Autowired
    SellerRepository sellerRepository;
}
