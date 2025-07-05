import java.util.*;
public class checkout {
    public static void process(customer customer, cart cart) {
        if(cart.isEmpty()){
            System.out.println("The cart is empty");
            return;

        }
        double total = 0;
        List<shippingAbility> items = new ArrayList<>();
        List<Integer> quantity = new ArrayList<>();
        for(ItemInCart item : cart.getItems()){
            product price1 = item.product;
            int quantity1 = item.quantity;
            if (price1.isExpired()){
                System.out.println(" "+price1.getName() +" is expired" );
                return;
            }
            if (quantity1 > price1.getQuantity()){
                System.out.println(" "+price1.getName() +" is out of stock :( ");
                return;
            }
            if(price1 instanceof shippingAbility ){
                items.add((shippingAbility)price1);
                quantity.add(quantity1);
            }
            total += item.gettotalprice();
        }
     double shippingFees = 0;
        for(int i = 0; i < items.size(); i++){
            shippingFees+= items.get(i).getWeight()*quantity.get(i)*10;
        }
        double  Tprice = total+shippingFees;

         if (!customer.withdraw((float) Tprice)){
             System.out.println("low balance");
             return;

         }
        for (ItemInCart item : cart.getItems()) {
            item.product.resetQuantity(item.quantity);
        }
        if (!items.isEmpty()) {
            shipping.ship(items, quantity);
        }

         System.out.println("Receipt");
         for(ItemInCart item : cart.getItems()){
             System.out.printf("", item.quantity , item.product.getName(), item.gettotalprice() );

         }
        System.out.println("_________________________");
        System.out.printf("order total:        ", Tprice);
        System.out.printf("Shipping:         ", shippingFees);
        System.out.printf("Amount:          ", total);
        customer.Print_balance();

















    }

}
