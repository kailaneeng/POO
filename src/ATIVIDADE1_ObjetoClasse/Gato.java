package ATIVIDADE1_ObjetoClasse;

public class Gato {
    //atributos

    public String nome;
    public int qtdComidaDisponivel;
    public boolean sono = false;

    //construtor
    public Gato (String nome, int qtdComidaDisponivel, boolean sono ){
        this.nome = nome;
        this.qtdComidaDisponivel = qtdComidaDisponivel;
        this.sono = sono;

    }

    //metodos
    public void dormir() {
        if (sono= this.sono){
            System.out.println(nome + " esta com sono: ");
        }else{
         System.out.println(nome+ " sem sono: ");
        }
    }
    public void comer() {
        qtdComidaDisponivel -=1;
        System.out.println(nome + "comeu comida, restante: " + qtdComidaDisponivel);
    }
    public void cacsar() {
        System.out.println(nome + "esta cacsando");
    }


}

