package ATIVIDADE5_AssociaçãoEntreClasses;

public class Livro {
    //atributos
   private String titulo;
   private String autor;
   private String isbn;
   private boolean emprestado;

   //construtor
   public Livro (String titulo, String autor, String isbn, boolean emprestado){
       this.titulo= titulo;
       this.autor= autor;
       this. isbn= isbn;
       this.emprestado= emprestado;
   }
   public void setTitulo(String titulo){
       this.titulo= titulo;
    }
    public String getTitulo(){
       return titulo;
    }
    public void setAutor(String autor){
       this.autor= autor;
    }
    public String getAutor(){
       return autor;
    }
    public void setIbn(String isbn){
       this.isbn= isbn;
    }
    public String isbn(){
       return isbn;
    }
     public void setEmprestado( boolean emprestado){
       this.emprestado= emprestado;

     }
     public boolean getEmprestado(){
       return emprestado;
     }

   //metodos
   public void marcarComoEmprestado(){
       System.out.println();

   }
    public void marcarComoDisponivel(){
       System.out.println();
    }
    public void isEmprestado(){
       System.out.println();
    }
    public void exibirInformacoes(){
       System.out.println();
}

}
