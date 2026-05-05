package ATIVIDADE11_Polimorfismo_ClasseAbstrata;

public class Papagaio extends Animal {

        //atributos
        private String corPena;


        //construtor
        public Papagaio(String nome, String corPena) {
            super(nome);
            this.corPena = corPena;
        }

        public void setCorPena(String corPena) {
            this.corPena = corPena;
        }

        public String getCorPena () {
            return corPena;
        }

        //metodos
        public void emitirSom() {
            System.out.println(nome + " diz da o pe louro. ");
        }

        public void mover() {
            System.out.println(nome + " esta voando.  ");
        }

        public void cantar() {
            System.out.println(nome + " esta canatando.  ");
        }




}
