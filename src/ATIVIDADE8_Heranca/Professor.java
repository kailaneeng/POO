package ATIVIDADE8_Heranca;

public class  Professor extends Pessoa {

    //atributos
private String disciplina;


    //construtor
public Professor (String nome, int idade){

    super(nome, idade);
}

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }
//metodos

    public void ensinar(){
    System.out.println("daiciplina: "+getDisciplina());

}



}
