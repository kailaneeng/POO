package ATIVIDADE4_AssociaçãoEntreClasses;

public class Main {
    public static void main (String[] args){
        Carro carro1 = new Carro (" Hilux "," kai1107 ", " branco "," 08006872204 ");
        carro1.ligar();
        carro1.dirigir();
        carro1.frear();
        carro1.capotar();

        Pessoa p1=new Pessoa ("kailane", 21,"feminino","12345678");
        p1.usarCarro();
        p1.ligarCarro();
        p1.dirigirCarro();
        p1.frearCarro();


        }



}
