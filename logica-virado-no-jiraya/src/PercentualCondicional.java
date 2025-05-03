/*
* Dado um determinado salario
* Verifique se o salario é maior que 4500;
* Se for imprima 30% dele, caso contrário imprima 15% dele.
* Utilize apenas uma variável para armazenar o resultado.
* Diga na impressão ao que se refere o resultado
 */

import java.util.Scanner;

public class PercentualCondicional {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe seu salário:");
        float salario = input.nextFloat();
        float resultado = 0f;

        if(salario > 4500){
            resultado = salario * 0.3f;
            System.out.println("30% de " + salario + " é:"+ resultado);
        }else{
            resultado = salario * 0.15f;
            System.out.println("15% de " + salario + " é:"+ resultado);
        }
    }
}
