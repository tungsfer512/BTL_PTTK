package io.team05.btl.Service;

import io.team05.btl.Model.ProductVoucher;
import io.team05.btl.Repository.ProductVoucherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductVoucherService {
    @Autowired
    ProductVoucherRepository productVoucherRepository;
}
