package photos.brooklyn.shoppinglist.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="stores")
public class Store {
    private String id;
    private String name;
    private boolean active;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean isActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }
}
