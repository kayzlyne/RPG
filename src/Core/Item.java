package Core;

public class Item {

    private String name;
    private int price;
    private String description;
    private ItemType type;

    public Item(String name, int price, String description, ItemType type) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.type = type;
    }

    public String getName() { return name; }
    public int getPrice() { return price; }

    @Override
    public String toString() {
        return name + " - " + price + " barya (" + description + ")";
    }
}
