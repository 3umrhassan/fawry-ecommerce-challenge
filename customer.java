public class customer {
    String name;
    float balance;
    public customer(String name,float balance) {
        this.name = name;
        this.balance = balance;

    }
    public float getBalance() {
        return balance;

    }
    public boolean withdraw(float amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
    public void Print_balance(){
        System.out.println("The customer's balance is : "+balance);
    }
}
