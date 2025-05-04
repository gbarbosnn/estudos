package POO.Module01;

public class Account {
    String accountNumber;
    String accountOwner;
    double balance;

    /**
     * Prints the current account balance to the console.
     */
    void printBalance() {
        System.out.println("Balance: R$ " + balance);
    }


    /**
     * Performs a deposit into the account.
     *
     * @param amount The amount to deposit.
     * @return true if the deposit is successful, and false if it is not.
     */
    boolean deposit(double amount){
        if(amount < 0 ){
            return false;
        }

        balance += amount;
        return true;

    }

    /**
     * The method performs a withdrawal from the account.
     * @param amount The amount to withdraw.
     * @return true if the withdrawal is successful, and false if it is not.
     */
    boolean withdraw(double amount){
        if(amount > 0 && balance > 0 && amount <= balance){
            balance-=amount;
            return true;
        }

        return false;
    }
}
