package io.team05.btl.controller.dao;

import java.util.List;

import io.team05.btl.model.Image;

public interface ImageDAO {
    List<Image> getAllImageByProductId(Integer id);
}
