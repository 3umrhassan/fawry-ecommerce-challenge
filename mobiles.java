public class mobiles extends product implements shippingAbility{
    double weight;
    public mobiles(String name, float price, int quantity, double weight) {
        super(name, price, quantity);
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }
    public boolean isExpired(){
        return false;
    }
}
