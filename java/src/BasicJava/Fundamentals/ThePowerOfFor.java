package BasicJava.Fundamentals;

public class ThePowerOfFor {
    public static void main(String[] args) {

        int i, j;
        for (i = 0, j = 9; i <=10; i++, j--){
            System.out.println(i + " - " + j);
        }

        System.out.println("===============");
        for(int x = 1; x < 100; x = x *2) {
            System.out.println(x);
        }
    }
}
