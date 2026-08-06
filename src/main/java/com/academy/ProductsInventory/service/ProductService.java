package com.academy.ProductsInventory.service;

import com.academy.ProductsInventory.repository.entity.Product;
import java.util.List;

public interface ProductService {
    Product addProduct(Product product);
    List<Product> getAllProducts();
}
