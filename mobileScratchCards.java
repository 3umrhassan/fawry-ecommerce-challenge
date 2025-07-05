public class mobileScratchCards extends product{
    public mobileScratchCards(String name, float price, int quantity) {
        super(name, price, quantity);
    }
    public boolean isExpired(){
        return false;
    }
}
