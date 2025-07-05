import java.util.*;
public class cart {
    List<ItemInCart> items = new ArrayList<>();
    public void add(product product, int quantity ) {
        if (quantity > product.getQuantity()) {
            System.out.println("this quantity is more than stock");
            return;

        }
        items.add(new ItemInCart(product, quantity));
    }
    public List<ItemInCart> getItems() {
        return items;
    }
    public boolean isEmpty() {
        return items.isEmpty();
    }
}
