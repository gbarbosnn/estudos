package POO.Module01;

public class Account {
    String accountNumber;
    String accountOwner;
    double balance;

    /**
     * This method prints the account balance.
     */
    void printBalance(){
        System.out.println("Balance: R$ "+ balance);
    }

    /**
     * This method makes a deposit into the account.
     * @param amount This is the amount to deposit.
     */
    void deposit(double amount){
        balance += amount;
    }

}
