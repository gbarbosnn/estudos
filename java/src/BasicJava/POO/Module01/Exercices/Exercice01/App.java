package BasicJava.POO.Module01.Exercices.Exercice01;

/*
* - Crie a classe Fraction, que representa uma fração matemática;
* -- Esta classe deve ser capaz de armazenar o numerador e o denominador da fração;
* -- Ela ainda deve ter métodos que recebam uma fração como parâmetro, multiplicam ambas as fraçõee, e retornam uma nova fração como resultado;
* - Crie um programa que instancia duas frações, define os valores, calcula o valor da multiplicação entre elas e mostra o resultado;
* - Dica: a multiplicação de duas frações é feita através da multiplicação dos numeradores e dos denominadores.
*/

public class App {
    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction();

        f1.numerator = 2;
        f1.denominator = 1;

        f2.numerator = 4;
        f2.denominator = 2;

        System.out.println(f1.multiplyBy(f2).numerator);
        System.out.println(f1.multiplyBy(f2).denominator);
    }
}
