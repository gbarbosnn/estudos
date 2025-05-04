package POO.Module01;

public class App2 {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(100);
        account.printBalance();

        account.deposit(200);
        account.printBalance();
    }
}
