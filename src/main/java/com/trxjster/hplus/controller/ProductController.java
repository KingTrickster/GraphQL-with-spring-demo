package com.trxjster.hplus.controller;

import com.trxjster.hplus.data.Customer;
import com.trxjster.hplus.data.CustomerRepository;
import com.trxjster.hplus.data.Product;
import com.trxjster.hplus.data.ProductRepository;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class ProductController {

    private final ProductRepository productRepository;

    public ProductController( ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @QueryMapping
    public Iterable<Product> products(){
        return this.productRepository.findAll();
    }
}
