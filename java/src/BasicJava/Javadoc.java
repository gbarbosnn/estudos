package BasicJava;

/**
 * A classe {@code Javadoc} demonstra o uso de comentários Javadoc em Java.
 * Contém exemplos de métodos com diferentes assinaturas e propósitos.
 *
 * <p>Esta classe inclui:
 * <ul>
 *   <li>Um método principal para execução do programa.</li>
 *   <li>Métodos auxiliares para exibição e comparação de valores.</li>
 * </ul>
 *
 * @author Gustavo Nunes
 * @version 1.0.0
 * @since 1.0.0
 */

@Deprecated(since = "2.0", forRemoval = true)
public class Javadoc {

    /**
     * Construtor padrão da classe {@code Javadoc}.
     * Inicializa a classe sem parâmetros.
     */
    public Javadoc() {
        // Inicialização padrão (se necessário)
    }

    /**
     * Método principal que inicia a execução do programa.
     *
     * <p>Este método chama os métodos {@link #m1(int)} e {@link #m2(double, double)}
     * para demonstrar o uso de Javadoc em métodos auxiliares.
     *
     * @param args Argumentos fornecidos pela linha de comando (não utilizados neste exemplo).
     */
    public static void main(String[] args) {
        m1(10);
        boolean resultado = m2(5.5, 3.2);
        System.out.println("Resultado de m2: " + resultado);
    }

    /**
     * Exibe o valor inteiro recebido como parâmetro no console.
     *
     * @param x Valor inteiro a ser exibido.
     */
    private static void m1(int x) {
        System.out.println("Valor recebido: " + x);
    }

    /**
     * Compara dois números e retorna {@code true} se o primeiro for maior que o segundo.
     *
     * <p>Este método é útil para verificar relações entre dois valores numéricos.
     *
     * @param n1 Primeiro número para comparação.
     * @param n2 Segundo número para comparação.
     * @return {@code true} se {@code n1 > n2}, caso contrário {@code false}.
     */
    private static boolean m2(double n1, double n2) {
        return n1 > n2;
    }
}