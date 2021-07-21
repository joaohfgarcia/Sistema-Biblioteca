
package modelo;

 public class Funcionario extends Usuario {
     
    //atributos 
     private String cargo;
     
    
    //construtores
    
    public Funcionario(String cargo,String senha,String nome,String endereco,String email,String telefone,String nascimento,String cpf){
        super(senha,nome,endereco,email,telefone,nascimento,cpf);
        this.cargo = cargo;
    }
          
    

    public Funcionario() {}

    //metodos

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

   
    public String toString() {
        return "Funcionario{" + "cargo=" + cargo + '}';
    }
    
    
    
 
	
}
