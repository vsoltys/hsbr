package com.memphis.sandbox.reactive.hsbr.api;

import com.memphis.sandbox.reactive.hsbr.model.Dish;
import com.memphis.sandbox.reactive.hsbr.service.KitchenService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@Slf4j
@RestController
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ServerController {

    private final KitchenService kitchenService;

    @GetMapping(value = "/server", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    Flux<Dish> serveDishes() {
        return kitchenService.getDishes();
    }

    @GetMapping(value = "/served-dishes", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    Flux<Dish> deliverDishes() {
        return kitchenService.getDishes()
                .map(Dish::deliver);
    }
}
