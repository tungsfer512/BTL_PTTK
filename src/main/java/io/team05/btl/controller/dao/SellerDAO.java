package io.team05.btl.controller.dao;

import io.team05.btl.model.Order;
import io.team05.btl.model.Product;
import io.team05.btl.model.Seller;
import io.team05.btl.model.Voucher;

public interface SellerDAO {
    public Seller sellerRegister(Integer id);
    public Seller getSellerById(Integer id);
    public Product addProduct(Product product);
    public Product updateProduct(Product product);
    public void deleteProductById(Integer id);
    public Voucher addVoucher(Voucher voucher);
    public Voucher updateVoucher(Voucher voucher);
    public void deleteVoucherById(Integer id);
    public Order updateOrder(Order order);
    public void viewStatistic();
}
