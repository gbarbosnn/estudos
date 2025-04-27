/*
* Crie uma váriavel que irá guardar o valor de um salário
* Calcule a 30%, 15% e 5% desse salário
* Reutilize o resultado a cada cálculo.
*/

public class ReutilizandoVariaveis {
    public static void main(String[] args) {
        float salario = 5000f;

        float resultado = salario * 0.3f;
        System.out.println(resultado);

        resultado= salario * 0.15f;
        System.out.println(resultado);

        resultado= salario *0.5f;
        System.out.println(resultado);
    }
}
