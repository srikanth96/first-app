package com.sri.learning.firstapp.products.service;

import com.sri.learning.firstapp.products.controller.ProductRequest;
import com.sri.learning.firstapp.products.repository.ProductEntity;
import com.sri.learning.firstapp.products.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public List<ProductEntity> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public ProductEntity saveProduct(ProductRequest request) {
        ProductEntity productEntity = ProductEntity.builder().category(request.getCategory()).name(request.getName()).build();
        return productRepository.save(productEntity);
    }
}
