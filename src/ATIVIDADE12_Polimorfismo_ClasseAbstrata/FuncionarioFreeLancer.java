package ATIVIDADE12_Polimorfismo_ClasseAbstrata;

public class FuncionarioFreeLancer extends Funcionario {
    public double valorHora;
    public int horasTrabalhadas;




    public FuncionarioFreeLancer(String nome, double valorHora, int horasTrabalhadas){
        super(nome);
        this.valorHora=valorHora;
        this.horasTrabalhadas=horasTrabalhadas;
    }

    public double calcularSalario(){
        return valorHora*horasTrabalhadas;
    };
}
