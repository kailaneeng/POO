import ATIVIDADE11_Polimorfismo_ClasseAbstrata.Gato;
import ATIVIDADE11_Polimorfismo_ClasseAbstrata.Papagaio;
import ATIVIDADE11_Polimorfismo_ClasseAbstrata.Vaca;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Vaca a1= new Vaca("rendeira","preta");
    a1.emitirSom();
    a1.mover();
    a1.comerCapim();

    Gato g1= new Gato("moana","amarelado");
    g1.emitirSom();
    g1.mover();
    g1.cacarRato();

    Papagaio p1= new Papagaio ("louro","verde");
    p1.emitirSom();
    p1.mover();
    p1.cantar();

}
