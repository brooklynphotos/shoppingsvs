package photos.brooklyn.shoppinglist.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="items")
public class Item {
    private boolean active;
    private String name;
    private int id;
    private String description;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public boolean isActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }
}
