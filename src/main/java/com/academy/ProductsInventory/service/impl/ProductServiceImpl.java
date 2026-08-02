package com.academy.ProductsInventory.service.impl;

import com.academy.ProductsInventory.model.Product;
import com.academy.ProductsInventory.repository.ProductRepository;
import com.academy.ProductsInventory.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        //Aqui colocaremos luego la logica para agregar productos
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

}
