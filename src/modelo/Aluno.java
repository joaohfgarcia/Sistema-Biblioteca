package modelo;

public class Aluno extends Usuario {

    private String curso;
    private String matricula;

    public Aluno(String curso, String matricula, String senha, String nome, String endereco, String email, String telefone, String nascimento, String cpf) {
        super(senha, nome, endereco, email, telefone, nascimento, cpf);
        this.curso = curso;
        this.matricula = matricula;

    }
    public Aluno(){}
    

    public String getCurso() {
        return curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    
    public String toString() {
        return "Aluno{" + "curso=" + curso + ", matricula=" + matricula + '}';
    }
    
}
