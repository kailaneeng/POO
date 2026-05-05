package ATIVIDADE4_AssociaçãoEntreClasses;

public class Carro {

    // atrributo
private String modelo;
private String placa;
private String cor;
private String documento;



    //construto
public Carro (String modelo, String placa,String cor, String documento ){
 this.modelo = modelo;
 this.placa = placa;
 this.cor = cor;
 this.documento = documento;

}

    //metodo

    public void ligar(){
        System.out.println(modelo+" esta ligado ");
    }
    public void dirigir(){
        System.out.println(modelo+" esta dirigindo ");
    }
    public void frear(){
        System.out.println(modelo+" esta freiando ");
    }

    public void capotar(){

        System.out.println(modelo+" esta capotando (help me) ");
    }

}
