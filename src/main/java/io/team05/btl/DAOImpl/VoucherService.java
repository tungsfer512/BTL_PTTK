package io.team05.btl.Service;

import io.team05.btl.Repository.VoucherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoucherService {
    @Autowired
    VoucherRepository voucherRepository;
}
