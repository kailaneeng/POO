package ATIVIDADE21_AgendaContatos_utilizandoArrayList;

public class Main {
    public static void main(String[]args){
        Agenda a1= new Agenda();
        Contato c1= new Contato("mary");
        Contato c2= new Contato("julia");
        Contato c3= new Contato("gatti");

        Agenda.adicinar(c1);
        Agenda.add(c2);
        Agenda.add(c3);

        Agenda.mostrarContato();

        Agenda.removerContato(c3);

        Agenda.mostrarContato();


    }

}
