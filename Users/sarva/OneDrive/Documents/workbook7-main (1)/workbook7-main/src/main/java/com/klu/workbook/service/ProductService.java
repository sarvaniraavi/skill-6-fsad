package com.klu.workbook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klu.workbook.model.Product;
import com.klu.workbook.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    ProductRepository repo;

    public Product addProduct(Product p)
    {
        return repo.save(p);
    }

    public List<Product> getProducts()
    {
        return repo.findAll();
    }
}