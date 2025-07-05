public class ItemInCart {
    public product product;
    public int quantity;
    public ItemInCart(product product, int quantity) {
        this.product = product;
        this.quantity = quantity;

    }
    public double gettotalprice() {
        return product.price * quantity;
    }
}

