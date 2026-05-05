package ATIVIDADE3_ObjetoClasse;

public class Flor {
    public String nome;
    public String cor;

    //constructor

    public Flor (String nome, String cor){
        this.nome=nome;
        this.cor=cor;
    }

    //metodos

    public void mostrarDados(){
        System.out.println("nome: "+nome );
        System.out.println("cor: " +cor );

    }


}
