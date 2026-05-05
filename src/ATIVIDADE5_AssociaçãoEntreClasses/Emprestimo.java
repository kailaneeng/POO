package ATIVIDADE5_AssociaçãoEntreClasses;

public class Emprestimo {
    //atributos

    private Livro livro;
    private Leitor leitor;
    private DataRetirada dataRetirada;
    private DataDevolucao DataDevolucao;

    //construtor
    public Emprestimo(Livro livro, Leitor leitor, DataRetirada dataRetirada, DataDevolucao dataDevolucao){
        this.livro= livro;
        this.leitor=leitor;
    }

    //metodos



}
