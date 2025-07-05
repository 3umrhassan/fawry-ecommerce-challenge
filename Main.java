public class Main {
    public static void main(String[] args) {
        customer customer  = new customer("Omar", 12000);

        cheese cheese = new cheese(2.2, false , "blue cheese", 550, 2);
        mobiles mobile = new mobiles("iphone 12", 9000, 1, 180);
        mobileScratchCards card = new mobileScratchCards("Orange units ", 50, 1);

        cart cart = new cart();
        cart.add(cheese, 2);
        cart.add(mobile, 1);
        cart.add(card, 1);

        checkout.process(customer, cart);
    }
}
