abstract class product {
    String name;
    float price;
    int quantity;
    public product(String name, float price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public abstract boolean isExpired();
    public String getName() {
        return name;
    }
    public float getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }

    public void resetQuantity(int amount) {
        quantity = quantity - amount;

    }

}
