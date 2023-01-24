package com.sri.learning.firstapp.products.controller;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class ProductResponse {
    private Long id;
    private String name;
    private String category;
}
