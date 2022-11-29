package io.team05.btl.controller.dao;

import java.util.List;

import io.team05.btl.model.Address;

public interface AddressDAO {
    public Address getAddressByUserId(Integer id);
    public List<Address> groupCutstomerByAddressId(Integer id);
    public List<Address> groupSellerByAddressId(Integer id);
}
