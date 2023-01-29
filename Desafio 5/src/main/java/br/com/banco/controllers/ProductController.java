package br.com.banco.controllers;


import br.com.banco.models.Product;
import br.com.banco.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@org.springframework.stereotype.Controller
public class ProductController {

    @Autowired //
    ProductRepository productRepository;

    @GetMapping("/api/v1/test")
    public ResponseEntity TestingRequest(){

        //sempre retorna algo para o usuario
        return new ResponseEntity("OK", HttpStatus.ACCEPTED);
    }

    @GetMapping("/api/v1/listProducts")
    public ResponseEntity listProducts(@RequestParam double price){

        List<Product> myConsult = productRepository.findPriceAbove(price);

        //sempre retorna algo para o usuario
        return new ResponseEntity(myConsult, HttpStatus.ACCEPTED);
    }

}

/*
* controller é a classe que contem os endpoints;
*
* endpoints são funçoes que são execultadas ao receber um request
*
*
*
* */