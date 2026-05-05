package ATIVIDADE12_Polimorfismo_ClasseAbstrata;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class main {
    public static void main(String[]args){

        FuncionarioCLT f1= new FuncionarioCLT("lucas", 20000);
        f1.calcularSalario();
        System.out.println( "o salario é: " +f1.calcularSalario());

        FuncionarioFreeLancer f2= new FuncionarioFreeLancer("jr",100,8 );
        f2.calcularSalario();
        System.out.println();
        System.out.println("o salario é: " +f2.calcularSalario());

    }

}
