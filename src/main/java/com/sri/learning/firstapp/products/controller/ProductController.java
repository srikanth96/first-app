package com.sri.learning.firstapp.products.controller;

import com.sri.learning.firstapp.products.repository.ProductEntity;
import com.sri.learning.firstapp.products.repository.ProductRepository;
import com.sri.learning.firstapp.products.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductMapper productMapper;
    @GetMapping("/products")
    public List<ProductResponse> getAllProducts() {
        return productMapper.mapEntityToResponse(productService.getAllProducts());
    }

    @PostMapping("/products")
    public ProductEntity saveProduct(@RequestBody ProductRequest request) {
        log.info(request.toString());
        return productService.saveProduct(request);
    }
}
