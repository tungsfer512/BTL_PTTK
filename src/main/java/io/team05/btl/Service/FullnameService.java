package io.team05.btl.Service;

import io.team05.btl.Repository.FullnameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FullnameService {
    @Autowired
    FullnameRepository fullnameRepository;
}
