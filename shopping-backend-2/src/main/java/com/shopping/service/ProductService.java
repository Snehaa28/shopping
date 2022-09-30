package com.shopping.service;

import com.shopping.model.Products;
import com.shopping.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public Products getAllProducts(){
        return Products.builder()
                .products(productRepository.findAll())
                .build();
    }
}