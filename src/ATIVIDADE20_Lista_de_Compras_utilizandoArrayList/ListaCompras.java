package ATIVIDADE20_Lista_de_Compras_utilizandoArrayList;
import java.util.ArrayList;

public class ListaCompras {

    private ArrayList<Item> lista;
    //private Item item;

    public ListaCompras(){
        lista = new ArrayList<>();

    }

    public void adicionarItem(Item item){
        lista.add(item);
        System.out.println("Item adicionado: "+ item.getNome());
    }

    public void removerItem(Item item){
        lista.remove(item);
        System.out.println("item removido: " +item.getNome());

    }

    public void mostrarItem(){
        System.out.println("lista de compras");

        for (Item item : lista){
            System.out.println(item.getNome());

        }

    }
}
