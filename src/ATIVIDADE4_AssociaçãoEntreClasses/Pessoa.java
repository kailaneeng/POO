package ATIVIDADE4_AssociaçãoEntreClasses;

public class Pessoa {
    // atrributo

    private String nome;
    private int idade;
    private String sexo;
    private String cpf;

    //construto

public Pessoa (String nome,int idade, String sexo, String cpf){
    this.nome= nome;
    this.idade= idade;
    this.sexo=sexo;
    this.cpf=cpf;
}


    //metodo
    public void usarCarro(){

    System.out.println(nome+ " entrar no carro ");

    }

    public void ligarCarro(){
        System.out.println(nome+" ligando o carro");

    }

    public void dirigirCarro(){
        System.out.println(nome+" esta dirigindo");
    }

    public void frearCarro(){
    System.out.println(nome+ " freiando o carro, abruptamente");
    }

}
