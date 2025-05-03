package LogicaViradoNoJiraya;/*
Criar uma classe que calcule uma determinada porcentagem de um dado salário
 */

public class CalculadoraPercentualDoSalario {
    public static void main(String[] args) {
        float salario = 1450.50f;
        float percentual = 0.25f;
        float percentualDoSalario = salario * percentual;

        System.out.println((percentual * 100) + "% de um salário de " + salario + " é igual a: "+ percentualDoSalario);
    }
}
