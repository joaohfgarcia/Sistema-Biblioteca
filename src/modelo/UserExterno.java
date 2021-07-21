
package modelo;


public class UserExterno  extends Usuario{
    private String mensalidade;
    
    
    public UserExterno (String senha,String nome,String endereco,String email,String telefone,String nascimento,String cpf,String mensalidade){
        super(senha,nome,endereco,email,telefone,nascimento,cpf);
        this.mensalidade = mensalidade;
    
    }
    
    public UserExterno(){}

    public String getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(String mensalidade) {
        this.mensalidade = mensalidade;
    }

    public String toString() {
        return "UserExterno{" + "mensalidade=" + mensalidade + '}';
    }
    
    
    
}
