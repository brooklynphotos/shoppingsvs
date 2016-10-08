package photos.brooklyn.shoppinglist.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import photos.brooklyn.shoppinglist.model.Store;
import photos.brooklyn.shoppinglist.model.StoreShoppingList;

public interface StoreShoppingListRepository extends MongoRepository<StoreShoppingList, Integer> {
    Store findByName();

    List<Store> findByActiveIsTrue();

    @Query("{'store.id': ?0,'active': true, 'effectiveDate': {'$lt': today}}")
    StoreShoppingList findCurrentByStoreId(String storeId);
}
