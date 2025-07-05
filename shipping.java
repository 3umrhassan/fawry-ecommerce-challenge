import java.util.*;
public class shipping {
    public static void  ship(List<shippingAbility> items, List<Integer> quantity)  {
        double Tweight = 0;
        System.out.println("the shipment");
        for (int i = 0; i < items.size(); i++) {
            shippingAbility item = items.get(i);
            int quantity2 = quantity.get(i);
            double weight= item.getWeight()*quantity2;
            Tweight += weight;

        }
        System.out.println("The total weight of the  shipment is "+Tweight);
    }
}
