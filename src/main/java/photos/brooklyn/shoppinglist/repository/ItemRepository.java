package photos.brooklyn.shoppinglist.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import photos.brooklyn.shoppinglist.model.Item;

public interface ItemRepository extends MongoRepository<Item, Integer> {
    Item findByName();

    List<Item> findByActiveIsTrue();
}
