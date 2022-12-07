package com.product.catalog.controller;

import com.product.catalog.model.Product;
import com.product.catalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductRepository repository;

    @RequestMapping(method = RequestMethod.POST)
    Product create(@RequestBody Product product){
        return repository.save(product);

    }

    @RequestMapping(value = "/{id}" , method = RequestMethod.GET)
    Optional<Product> findById(@RequestBody Long id){
        return repository.findById(id);
    }
}
