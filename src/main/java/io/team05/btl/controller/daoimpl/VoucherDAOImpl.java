package io.team05.btl.controller.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.team05.btl.controller.dao.VoucherDAO;
import io.team05.btl.model.Voucher;
import io.team05.btl.repository.*;

@Service
public class VoucherDAOImpl implements VoucherDAO {
    @Autowired
    VoucherRepository voucherRepository;

    @Override
    public List<Voucher> getAllVoucher() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Voucher> getAllVoucherByProductId(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Voucher> getAllVoucherByShopId(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Voucher getVoucherById(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }
}
