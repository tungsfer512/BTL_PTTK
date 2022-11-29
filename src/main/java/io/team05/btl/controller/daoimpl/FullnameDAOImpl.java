package io.team05.btl.controller.daoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.team05.btl.controller.dao.FullnameDAO;
import io.team05.btl.model.Fullname;
import io.team05.btl.repository.*;

@Service
public class FullnameDAOImpl implements FullnameDAO {
    @Autowired
    FullnameRepository fullnameRepository;

    @Override
    public Fullname getFullnameBuUserId(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }
}
