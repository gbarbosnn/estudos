package BasicJava.POO.Module01;

public class App {
    public static void main(String[] args) {
        Account accountGustavo = new Account();

        accountGustavo.accountNumber = "1234-6";
        accountGustavo.accountOwner = "Gustavo";
        accountGustavo.balance = 200;

        Account accountGabriel = new Account();

        accountGabriel.accountNumber = "1235-6";
        accountGabriel.accountOwner = "Gabriel";
        accountGabriel.balance = 400;

        System.out.println(accountGabriel.accountNumber);
        System.out.println(accountGabriel.accountOwner);
        System.out.println(accountGabriel.balance);
        System.out.println("---------------------");
        System.out.println(accountGustavo.accountNumber);
        System.out.println(accountGustavo.accountOwner);
        System.out.println(accountGustavo.balance);

    }
}
