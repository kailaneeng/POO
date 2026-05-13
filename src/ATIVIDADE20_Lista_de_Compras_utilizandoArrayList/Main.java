package ATIVIDADE20_Lista_de_Compras_utilizandoArrayList;

public class Main {
    public static void main (String[]args){

        ListaCompras lista = new ListaCompras();
        Item item1 = new Item ("Arroz");
        Item item2 = new Item ("feijao");
        Item item3 = new Item ("Carne");

        lista.adicionarItem(item1);
        lista.adicionarItem(item2);
        lista.adicionarItem(item3);

        lista.removerItem(item1);

        lista.mostrarItem();
    }
}
