package com.memphis.sandbox.reactive.hsbr.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;


@Getter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
public class Dish {

    private final String description;

    private boolean delivered = false;

    public static Dish deliver(Dish dish) {
        var deliveredDish = new Dish(dish.description);
        deliveredDish.delivered = true;

        return deliveredDish;
    }
}
