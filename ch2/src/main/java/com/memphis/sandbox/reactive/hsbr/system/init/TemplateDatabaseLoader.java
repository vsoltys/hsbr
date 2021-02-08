package com.memphis.sandbox.reactive.hsbr.system.init;

import com.memphis.sandbox.reactive.hsbr.model.Item;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoOperations;

@Configuration
public class TemplateDatabaseLoader {

    @Bean
    CommandLineRunner initialize(MongoOperations mongo) {
        return args -> {
            mongo.save(Item.builder()
                    .name("Alf alarm clock")
                    .price(19.99)
                    .build());

            mongo.save(Item.builder()
                    .name("Smurf TV tray")
                    .price(24.99)
                    .build());
        };
    }
}
