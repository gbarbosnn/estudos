package BasicJava.POO.Module01.Exercices.Exercice02;


/*
* Crie uma classe Lamp que possui um atributo on, o qual indica se a lâmpada está ligada ou desligada.
*
* Ao construir uma lâmpada, o estado dela (liga ou desligada) deve ser fornecido.
* Para ligar ou desligar a lâmpada, os métodos turnOn() e turnOf() devem ser chamados, respectivamente. Aliás, esta é a unica forma de alterar o estado da lâmpada.
*
* A lâmpaada também deve possuir um método showState() retornando se ela esta ligada ou não
*/
public class App {
    public static void main(String[] args) {
        Lamp lampada = new Lamp(true);

        lampada.showState();
        lampada.turnOff();
        lampada.showState();
    }

}
