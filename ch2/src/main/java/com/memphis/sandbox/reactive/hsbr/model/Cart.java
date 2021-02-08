package com.memphis.sandbox.reactive.hsbr.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
public class Cart {

    @Id
    private String id;

    @Builder.Default
    private List<CartItem> cartItems = new ArrayList<>();
}
