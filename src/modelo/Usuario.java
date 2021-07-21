
package modelo;


public class Usuario {
    
    //atributos
 
    private String senha;
    private String nome;
    private String endereco;
    private String email;
    private String telefone;
    private String nascimento;
    private String cpf;
	
	
    //construtores
    
    public Usuario(String senha,String nome,String endereco,String email,String telefone,String nascimento,String cpf) {
        this.senha = senha ;
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
        this.nascimento = nascimento;
        this.cpf = cpf ;

    }
    
    public Usuario() {}
   
    //metodos
    
    public String toString() {
        return "Usuario [ senha=" + senha + ", nome=" + nome + ", endereco=" + endereco + ", email="
                        + email + ", telefone=" + telefone + ",nascimento=" + nascimento +",cpf="+cpf+ "]";
    }
    
    //acessadores e modificadores de atributos
    
   
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
     public String getNascimento() {
        return nascimento;
    }
    
    public String getCpf() {
        return cpf;
    }
     
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
		
}
