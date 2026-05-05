package ATIVIDADE2_ObjetoClasse;

public class Pessoa {

    //atributos

    public String nome;

    public int idade;


    //construtor

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;

    }

    //metodos

    public void mostrarDados(){
        System.out.println( "nome: " + this.nome);
        System.out.println("idade:" + this.idade);
    }



}
