package com.makeplace.api.service;

import com.makeplace.api.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public void blablabla() {
        productRepository.findAll();
    }
}
