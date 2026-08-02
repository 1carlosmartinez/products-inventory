package com.academy.ProductsInventory.service;

import com.academy.ProductsInventory.model.Product;
import java.util.List;

public interface ProductService {
    Product addProduct(Product product);
    List<Product> getAllProducts();
}
