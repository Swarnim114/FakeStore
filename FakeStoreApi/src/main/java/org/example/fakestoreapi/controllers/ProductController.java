package org.example.fakestoreapi.controllers;

import org.example.fakestoreapi.models.Product;
import org.example.fakestoreapi.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;
    ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id")Long id){
//        throw new RuntimeException("haha you noob");
        return productService.getProductById(id);
    }
    @GetMapping("")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
}
