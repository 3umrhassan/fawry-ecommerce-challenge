public class cheese extends product implements shippingAbility{
    double weight;
    boolean expireDate;
    public cheese(double weight, boolean expireDate, String name , float price , int quantity) {
        super(name, price, quantity);
        this.weight = weight;
        this.expireDate = expireDate;
    }
    public double getWeight() {
        return weight;
    }
    public boolean isExpired() {
        return expireDate;
    }
}

