package BasicJava.Fundamentals;

import java.util.Scanner;

public class SwitchExpressions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nº do mês: ");
        int month = input.nextInt();

        int days = switch (month){
            case 1,3,5,7,8,10,12 -> 31;
            case 2 ->28;
            case 4,6,9,11 -> 30;
            default -> {
                System.out.println("Mês inválido");
                yield 0;
            }
        };

        System.out.println(days + " dias");
    }
}