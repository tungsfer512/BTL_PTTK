package io.team05.btl.controller.daoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.team05.btl.controller.dao.FullnameDAO;
import io.team05.btl.model.*;
import io.team05.btl.repository.*;

@Service
public class FullnameDAOImpl implements FullnameDAO {
    @Autowired
    FullnameRepository fullnameRepository;
    @Autowired
    UserRepository userRepository;

    @Override
    public Fullname getFullnameByUserId(Integer id) {
        User user = userRepository.findById(id).get();
        return fullnameRepository.getFullnameByUserId(user.getId());
    }
}
