package com.memphis.sandbox.reactive.hsbr.repository;

import com.memphis.sandbox.reactive.hsbr.model.Cart;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface CartRepository extends ReactiveCrudRepository<Cart, String> {
}
