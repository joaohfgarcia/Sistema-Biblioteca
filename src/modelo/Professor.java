
package modelo;


public class Professor extends Usuario{
    private String departamento;
    
    public Professor (String departamento,String senha,String nome,String endereco,String email,String telefone,String nascimento,String cpf){
        super(senha,nome,endereco,email,telefone,nascimento,cpf);
        this.departamento = departamento;
        
    }
    public Professor(){}
    

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

   
    public String toString() {
        return "Professor{" + "departamento=" + departamento + '}';
    }
    
}
