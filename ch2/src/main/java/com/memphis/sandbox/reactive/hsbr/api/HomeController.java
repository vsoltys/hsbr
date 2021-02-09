package com.memphis.sandbox.reactive.hsbr.api;

import com.memphis.sandbox.reactive.hsbr.model.Cart;
import com.memphis.sandbox.reactive.hsbr.repository.CartRepository;
import com.memphis.sandbox.reactive.hsbr.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.reactive.result.view.Rendering;
import reactor.core.publisher.Mono;

@Controller
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class HomeController {

    private ItemRepository itemRepository;
    private CartRepository cartRepository;

    @GetMapping
    Mono<Rendering> home() {
        return Mono.just(Rendering.view("home.html")
                .modelAttribute("items",
                        itemRepository.findAll())
                .modelAttribute("cart",
                        cartRepository.findById("My Cart")
                                .defaultIfEmpty(Cart.builder()
                                        .id("My Cart")
                                        .build()))
                .build()
        );
    }
}
