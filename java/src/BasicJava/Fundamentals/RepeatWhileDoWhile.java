package BasicJava.Fundamentals;

public class RepeatWhileDoWhile {
    public static void main(String[] args) {
        int number = 11;

        System.out.println("While");
        while(number <= 10){
            System.out.println(number);

            number++;
        }
        System.out.println("Fim");

        int numberTwo = 11;
        System.out.println("Do While");
        do {
            System.out.println(numberTwo);
            numberTwo++;
        }while (numberTwo<=10);

        System.out.println("Fim");
    }
}
