package BasicJava.POO.Module01.Exercices.Exercice01;

public class Fraction {
    int numerator, denominator;

    Fraction multiplyBy(Fraction fractionToMultiply){
        Fraction result = new Fraction();
        result.numerator = numerator * fractionToMultiply.numerator;
        result.denominator = denominator * fractionToMultiply.denominator;

        return result;
    };
}
