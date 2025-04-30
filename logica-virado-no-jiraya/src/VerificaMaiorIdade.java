/*
* Receba uma idade;
* Se maior ou igual a 18 anos imprima "Adulto";
* Se menor a 18 anos imprima "Ainda não é adulto";
 */

public class VerificaMaiorIdade {
    public static void main(String[] args) {
        short idade = 17;

        if(idade >= 18){
            System.out.println("Adulto");
        } else {
            System.out.println("Ainda não é adulto");
        }
    }
}
