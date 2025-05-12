package BasicJava.POO.Module01;

public class App2 {
    public static void main(String[] args) {
        Account account = new Account();

        if(!account.deposit(-100)){
            System.out.println("Ops, depósito não realizado");
        };

        account.printBalance();
        System.out.println("==================================");

        account.deposit(200);
        account.printBalance();
        System.out.println("==================================");

        if(!account.withdraw(-50)){
            System.out.println("Ops, saque não realizado");
        }
        System.out.println("==================================");

        account.withdraw(50);
        account.printBalance();
        System.out.println("==================================");

        if(!account.withdraw(200)){
            System.out.println("Ops, saque não realizado");
        }
        System.out.println("==================================");

        if(!account.withdraw(150)){
            System.out.println("Ops, saque não realizado");
        }
        account.printBalance();
        System.out.println("==================================");
    }
}
