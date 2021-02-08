package com.memphis.sandbox.reactive.hsbr.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class CartItem {

    private Item item;

    @Builder.Default
    private int quantity = 1;
}
