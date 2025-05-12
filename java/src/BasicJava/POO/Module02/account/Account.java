package BasicJava.POO.Module02.account;

public class Account {
    private final String owner;
    private final String number;
    private double balance = 0;

    private static int currentId = 1;

    public Account(String owner){
        this.owner = owner;
        this.number = String.valueOf(currentId++);
    }

    public void deposit(double amount){
        if(amount > 0){
            balance+=amount;
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && balance > 0 && amount <= balance){
            balance-=amount;
        }
    }

    public void printInformations(){
        System.out.println("Account{" +
                "owner='" + owner +'\'' +
                ", number='" + number + '\''+
                ", balance=" + balance+"}"
        );
    }
}
