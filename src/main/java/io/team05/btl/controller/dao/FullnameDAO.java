package io.team05.btl.controller.dao;

import io.team05.btl.model.Fullname;

public interface FullnameDAO {
    public Fullname getFullnameByUserId(Integer id);
}
