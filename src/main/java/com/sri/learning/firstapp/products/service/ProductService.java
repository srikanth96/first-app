package com.sri.learning.firstapp.products.service;

import com.sri.learning.firstapp.products.controller.ProductRequest;
import com.sri.learning.firstapp.products.repository.ProductEntity;

import java.util.List;

public interface ProductService {
    List<ProductEntity> getAllProducts();

    ProductEntity saveProduct(ProductRequest request);
}
