package ATIVIDADE11_Polimorfismo_ClasseAbstrata;

public class Vaca extends Animal {
    //atributos
    private String corCasco;


    //construtor
    public Vaca (String nome, String corCasco){
        super (nome);
        this.corCasco=corCasco;
    }

    public void setcorCasco(String corCasco){
        this.corCasco=corCasco;
    }
     public String getcorCasco (){
        return corCasco;
     }

    //metodos
    public void emitirSom(){
        System.out.println(nome+ " fez: muuuuh");
    }

    public void mover(){
        System.out.println(nome+ " esta caminhando. ");
    }

    public void comerCapim(){
        System.out.println(nome+ " esta Ruminando ");
    }




}
