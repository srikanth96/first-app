package com.sri.learning.firstapp.products.controller;

import com.sri.learning.firstapp.products.repository.ProductEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductMapper {

    public List<ProductResponse> mapEntityToResponse(List<ProductEntity> productEntities) {
        List<ProductResponse> result = new ArrayList<>();
        for (ProductEntity entity : productEntities){
            ProductResponse response = ProductResponse.builder().id(entity.getId()).name(entity.getName()).category(entity.getCategory()).build();
            result.add(response);
        }
        return result;
    }

}
