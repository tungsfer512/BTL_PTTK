package io.team05.btl.DAOImpl;

import io.team05.btl.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDAOImpl {
    @Autowired
    UserRepository userRepository;
}
