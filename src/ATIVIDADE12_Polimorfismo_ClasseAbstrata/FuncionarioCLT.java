package ATIVIDADE12_Polimorfismo_ClasseAbstrata;

public class FuncionarioCLT extends Funcionario {

    public double salario;
    public String nome;



    public FuncionarioCLT(String nome, double salario){
        super(nome);
        this.nome=nome;
        this.salario=salario;
    }

    public double calcularSalario(){
        return salario;
    };

}
