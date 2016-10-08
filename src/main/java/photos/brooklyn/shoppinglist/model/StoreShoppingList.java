package photos.brooklyn.shoppinglist.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="shoppingLists")
public class StoreShoppingList {
    private int id;
    private Date createdOn;
    private Date effectiveDate;
    private Store store;
    private Date lastUpdated;
    private boolean active;
    private List<DepartmentShoppingList> departmentShoppingList;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Date getCreatedOn() {
        return createdOn;
    }
    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }
    public Date getEffectiveDate() {
        return effectiveDate;
    }
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }
    public Store getStore() {
        return store;
    }
    public void setStore(Store store) {
        this.store = store;
    }
    public Date getLastUpdated() {
        return lastUpdated;
    }
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
    public List<DepartmentShoppingList> getDepartmentShoppingList() {
        return departmentShoppingList;
    }
    public void setDepartmentShoppingList(
            List<DepartmentShoppingList> departmentShoppingList) {
        this.departmentShoppingList = departmentShoppingList;
    }
    public boolean isActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }
}
