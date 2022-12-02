package com.shopping.car.service;

import com.shopping.car.model.Cart;
import com.shopping.car.model.Item;
import com.shopping.car.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Carservice {
    @Autowired
    private CartRepository cartRepository;

    
    public void salvar(Integer id, Item item){
        Optional<Cart> savedCart = cartRepository.findById(id);
        Cart cart;
        if (savedCart.equals(Optional.empty())) {
            cart = new Cart(id);
        }
        else {
            cart = savedCart.get();
        }
        cart.getItems().add(item);
         cartRepository.save(cart);
    }


}
