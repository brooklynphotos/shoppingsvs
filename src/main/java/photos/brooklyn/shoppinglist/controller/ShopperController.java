package photos.brooklyn.shoppinglist.controller;

import java.io.IOException;
import java.util.Date;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import photos.brooklyn.shoppinglist.model.Store;
import photos.brooklyn.shoppinglist.model.StoreShoppingList;

@RestController
@RequestMapping("/shopper")
public class ShopperController {

    @RequestMapping(value="/storeShoppingList/{id}", method = RequestMethod.GET)
    public StoreShoppingList getStoreShoppingList(@PathVariable int id) throws IOException{
        StoreShoppingList ssl = new StoreShoppingList();
        ssl.setCreatedOn(new Date());
        ssl.setEffectiveDate(new Date());
        ssl.setId(id);
        Store store = new Store();
        store.setId("wf");
        store.setName("Whole Foods");
        ssl.setStore(store);
        return ssl;
    }
}
