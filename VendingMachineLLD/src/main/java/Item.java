import java.nio.file.FileStore;

public class Item {
    ItemType itemType;
    int price;

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setType(ItemType coke) {
        this.itemType=coke;
    }

    public ItemType getType() {
        return this.itemType;
    }
}
