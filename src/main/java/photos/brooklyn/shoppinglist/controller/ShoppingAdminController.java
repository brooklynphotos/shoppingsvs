package photos.brooklyn.shoppinglist.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import photos.brooklyn.shoppinglist.model.Item;
import photos.brooklyn.shoppinglist.model.Store;
import photos.brooklyn.shoppinglist.model.StoreShoppingList;
import photos.brooklyn.shoppinglist.repository.ItemRepository;
import photos.brooklyn.shoppinglist.repository.StoreRepository;
import photos.brooklyn.shoppinglist.repository.StoreShoppingListRepository;

@RestController
@RequestMapping("/admin")
public class ShoppingAdminController {
    @Autowired
    private ItemRepository itemRepo;
    @Autowired
    private StoreRepository storeRepo;
    @Autowired
    private StoreShoppingListRepository storeShoppingListRepo;

    @RequestMapping(value="/items", method = RequestMethod.GET)
    public List<Item> getItems(@PathVariable int id){
        return itemRepo.findByActiveIsTrue();
    }

    @RequestMapping(value="/items", method = RequestMethod.POST)
    public Item addItem(@RequestBody Item item) {
        return itemRepo.save(item);
    }

    @RequestMapping(value="/stores/{id}", method = RequestMethod.GET)
    public Store getStore(@PathVariable String id) throws IOException{
        return storeRepo.findOne(id);
    }

    @RequestMapping(value="/stores", method = RequestMethod.GET)
    public List<Store> getStore() throws IOException{
        return storeRepo.findByActiveIsTrue();
    }

    @RequestMapping(value="/stores", method = RequestMethod.POST)
    public Store addStore(@RequestBody Store store) {
        return storeRepo.save(store);
    }

    @RequestMapping(value="/storeShoppingList", method = RequestMethod.POST)
    public StoreShoppingList addStoreShoppingList(@RequestBody StoreShoppingList ssl) {
        return storeShoppingListRepo.save(ssl);
    }

    @RequestMapping(value="/storeShoppingList/{storeShoppingListId}", method = RequestMethod.PUT)
    public StoreShoppingList updateStoreShoppingList(@PathVariable int storeShoppingListId, @RequestBody StoreShoppingList ssl) {
        if(ssl.getId() != storeShoppingListId) {
            throw new IllegalArgumentException("object id "+ssl.getId()+" does not equal to expected id: "+storeShoppingListId);
        }
        return storeShoppingListRepo.save(ssl);
    }

    @RequestMapping(value="/currentStoreShoppingList/{storeId}", method = RequestMethod.GET)
    public StoreShoppingList getCurrentStoreShoppingList(@PathVariable String storeId) {
        return storeShoppingListRepo.findCurrentByStoreId(storeId);
    }

}
