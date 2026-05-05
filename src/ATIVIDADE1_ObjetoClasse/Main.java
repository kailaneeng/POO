package ATIVIDADE1_ObjetoClasse;

public class Main {

    public static void main(String[] args) {
        Gato gato1 = new Gato(" sushi ", 3, true);
        gato1.comer();
        gato1.dormir();
        gato1.cacsar();

        Gato gato2 = new Gato(" cachacsa ", 2, false);
        gato2.comer();
        gato2.comer();
        gato2.dormir();
        gato2.cacsar();

        Gato gato3= new Gato(" moana: ", 4,true );
        gato3.cacsar();
        gato3.comer();
        gato3.comer();
        gato3.comer();
        gato3.dormir();

    }



}
