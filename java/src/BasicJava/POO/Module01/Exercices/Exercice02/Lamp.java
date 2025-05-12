package BasicJava.POO.Module01.Exercices.Exercice02;

public class Lamp {
    private boolean on;

    public Lamp(boolean on) {
        this.on = on;
    }

    void turnOn(){
        on = true;
    }

    void turnOff(){
        on = false;
    }

    void showState(){
        System.out.println("Lâmpada " + (on ? "ligada" : "desligada"));
    }

}
