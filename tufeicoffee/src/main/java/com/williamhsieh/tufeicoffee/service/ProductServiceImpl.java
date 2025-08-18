package com.williamhsieh.tufeicoffee.service;

import com.williamhsieh.tufeicoffee.dao.ProductDao;
import com.williamhsieh.tufeicoffee.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
