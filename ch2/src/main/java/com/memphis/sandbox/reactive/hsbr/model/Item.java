package com.memphis.sandbox.reactive.hsbr.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@Builder
@NoArgsConstructor
public class Item {

    @Id
    private String id;

    private String name;
    private double price;
}
