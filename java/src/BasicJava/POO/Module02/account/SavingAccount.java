package BasicJava.POO.Module02.account;

public class SavingAccount extends Account {
    private final double rate;

    public SavingAccount(String owner, double rate) {
        super(owner);
        this.rate = rate;
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount * rate);
    }
}