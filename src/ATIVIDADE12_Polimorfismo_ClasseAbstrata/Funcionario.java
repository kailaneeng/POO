package ATIVIDADE12_Polimorfismo_ClasseAbstrata;

public abstract class Funcionario {
       // atributos
    public String nome;


    //construtor

    public Funcionario( String nome) {
        this.nome=nome;
    }

    //metodos
    public abstract double calcularSalario( );

 }




