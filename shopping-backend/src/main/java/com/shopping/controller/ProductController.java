package com.shopping.controller;

import com.shopping.entity.Product;
import com.shopping.model.ProductDto;
import com.shopping.model.Products;
import com.shopping.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("product")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class ProductController {

    private final ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<Products> getAllProducts(){
        return ResponseEntity.ok(productService.getAllProducts());
    }
}
