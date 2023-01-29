package br.com.banco.controllers;


import br.com.banco.models.Order;
import br.com.banco.models.Product;
import br.com.banco.repositories.OrderRepository;
import br.com.banco.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;

@org.springframework.stereotype.Controller
public class OderController {


    @Autowired //
    OrderRepository orderRepository;

    @GetMapping("/api/v1/day_orders")
    public ResponseEntity ordersByDay(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date){

        List<Order> myConsult = orderRepository.findByOrderDate(date);

        //sempre retorna algo para o usuario
        return new ResponseEntity(myConsult, HttpStatus.ACCEPTED);

    }

    @GetMapping("/api/v1/statusOrder")
    public ResponseEntity ordersByStatus(@RequestParam String st){

        List<Order> myConsult = orderRepository.findByStatus(st);

        //sempre retorna algo para o usuario
        return new ResponseEntity(myConsult, HttpStatus.ACCEPTED);

    }

}
