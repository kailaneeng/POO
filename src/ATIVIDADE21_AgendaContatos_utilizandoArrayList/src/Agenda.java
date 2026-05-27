package ATIVIDADE21_AgendaContatos_utilizandoArrayList;

 import java.util.ArrayList;
public class Agenda {
    private ArrayList<Contato>lista;
    public Agenda(){
        lista=new ArrayList<>();
    }
    public void adicionarContato(Contato contato){
        lista.add(contato);
        System.out.println(" Contato adicionado:" +contato.getNome());
    }

    public void removerContato (Contato contato){
        lista.remove(contato);
        System.out.println("contato removido"+ contato.getNome());
    }

     public void listarContatos(){
        Sytem.out.println
        for (Contato contato: lista ) {
            System.out.println("-" +contato.getNome());
        }
        }
     }

}
