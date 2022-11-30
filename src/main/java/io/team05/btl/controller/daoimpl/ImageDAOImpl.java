package io.team05.btl.controller.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.team05.btl.controller.dao.ImageDAO;
import io.team05.btl.model.*;
import io.team05.btl.repository.*;

@Service
public class ImageDAOImpl implements ImageDAO {
    @Autowired
    ImageRepository imageRepository;

    public List<Image> getAllImage() {
        return imageRepository.findAll();
    }

    @Override
    public List<Image> getAllImageByProductId(Integer id) {
        return imageRepository.getAllImageByProductId(id);
    }

}
