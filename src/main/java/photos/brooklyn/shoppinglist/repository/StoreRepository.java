package photos.brooklyn.shoppinglist.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import photos.brooklyn.shoppinglist.model.Store;

public interface StoreRepository extends MongoRepository<Store, String> {
    Store findByName();

    List<Store> findByActiveIsTrue();
}
