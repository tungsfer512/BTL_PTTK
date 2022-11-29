package io.team05.btl.controller.dao;

import java.util.List;

import io.team05.btl.model.Voucher;

public interface VoucherDAO {
    public List<Voucher> getAllVoucher();
    public List<Voucher> getAllVoucherByProductId(Integer id);
    public List<Voucher> getAllVoucherByShopId(Integer id);
    public Voucher getVoucherById(Integer id);
}
