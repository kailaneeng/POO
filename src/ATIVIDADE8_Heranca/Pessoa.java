package ATIVIDADE8_Heranca;

public class Pessoa {

    //atributos
    private String nome;
    private int idade;

        //construtor
    public Pessoa(String nome, int idade){
        this.nome= nome;
        this.idade= idade;
    }

    public void  apresentar (){
        System.out.println("me apresentando: ");
        System.out.println( "Nome: "+nome);
        System.out.println(" idade"+idade);

    }

    }

