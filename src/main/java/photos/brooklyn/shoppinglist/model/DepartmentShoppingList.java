package photos.brooklyn.shoppinglist.model;

import java.util.List;

public class DepartmentShoppingList {
    private String name;
    private List<ShoppingItem> items;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<ShoppingItem> getItems() {
        return items;
    }
    public void setItems(List<ShoppingItem> items) {
        this.items = items;
    }
    
}
