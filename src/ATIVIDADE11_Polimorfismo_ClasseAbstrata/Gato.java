package ATIVIDADE11_Polimorfismo_ClasseAbstrata;

public class Gato extends Animal {
     //atributos
    private String corPelo;


    //construtor
     public Gato (String nome, String corPelo){
        super(nome);
        this.corPelo=corPelo;
     }

     public void setcorPelo(String corPelo){
         this.corPelo=corPelo;
     }
    public String getcorPelo(){
         return corPelo;
    }

    //metodos
    public void emitirSom(){
        System.out.println(nome+ " esta fazendo : miau. ");
    }
    public void mover(){
         System.out.println(nome+ " caiu em pe. " );

    }
    public void cacarRato(){
         System.out.println(nome+ " comeu o rato. ");
    }


}
