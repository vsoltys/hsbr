package com.memphis.sandbox.reactive.hsbr.repository;

import com.memphis.sandbox.reactive.hsbr.model.Item;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ItemRepository extends ReactiveCrudRepository<Item, String> {
}
