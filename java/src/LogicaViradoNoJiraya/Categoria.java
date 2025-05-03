package LogicaViradoNoJiraya;

public class Categoria {
    public static void main(String[] args) {
        String nomeDoParticipante = "Gustavo";
        short idadeDoParticipante= 9;

        if(idadeDoParticipante < 11){
            System.out.println(nomeDoParticipante + " participará da categorial Infantil!");
        } else if(idadeDoParticipante >= 11 && idadeDoParticipante<=15){
            System.out.println(nomeDoParticipante + " participará da categorial Juvenil!");
        } else if (idadeDoParticipante >=16 && idadeDoParticipante<=19) {
            System.out.println(nomeDoParticipante + " participará da categorial Pré-adulto!");
        }else {
            System.out.println(nomeDoParticipante + " participará da categorial Adulto!");
        }
    }
}
