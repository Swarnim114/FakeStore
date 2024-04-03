package org.example.fakestoreapi.services;

import org.example.fakestoreapi.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProductService {
    Product getProductById(Long id);

    List<Product> getAllProducts();
}
