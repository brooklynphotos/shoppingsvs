package photos.brooklyn.shoppinglist.model;

public class ShoppingItem {
    private Item item;
    private String quantity;
    private String onSaleDescription;
    private int priority;
    private String comment;
    public Item getItem() {
        return item;
    }
    public void setItem(Item item) {
        this.item = item;
    }
    public String getQuantity() {
        return quantity;
    }
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    public String getOnSaleDescription() {
        return onSaleDescription;
    }
    public void setOnSaleDescription(String onSaleDescription) {
        this.onSaleDescription = onSaleDescription;
    }
    public int getPriority() {
        return priority;
    }
    public void setPriority(int priority) {
        this.priority = priority;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
}
