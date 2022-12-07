package com.shopping.car.controller;


import com.shopping.car.model.*;
import com.shopping.car.repository.CartRepository;
import com.shopping.car.service.Carservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.Optional;

import static org.springframework.web.bind.annotation.ResponseStatus.*;


@RestController
@RequestMapping(value = "/cart")
public class CartController {

    @Autowired
    private CartRepository cartRepository;
    @Autowired
    private Carservice carservice;

    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Cart addItem(@PathVariable("id") Integer id, @RequestBody Item item) {
        Cart cart = new Cart();
        carservice.salvar(id, item);

        return cart;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<Cart> findById(@PathVariable("id") Integer id) {
        return cartRepository.findById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void clear(@PathVariable("id") Integer id) {
        cartRepository.deleteById(id);
    }

}