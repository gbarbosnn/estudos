package BasicJava.POO.Module02.app;

import BasicJava.POO.Module02.account.Account;
import BasicJava.POO.Module02.account.SavingAccount;

public class App {
    public static void main(String[] args) {
        Account a1 = new Account("Gustavo");
        a1.deposit(1000);
        a1.printInformations();

        System.out.println("----------");
        SavingAccount a2 = new SavingAccount("Gustavo", 1.2);
        a2.deposit(500);
        a2.printInformations();
    }
}
