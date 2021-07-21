
package modelo;


public class Espaco {
    
    //atributos
    
    private String descEspaco;
    private String capacidade;
    private boolean disponivel;
    
    
    //construtores
    
    public Espaco(String descEspaco, String capacidade, boolean disponivel) {
        this.descEspaco = descEspaco;
        this.capacidade = capacidade;
        this.disponivel = disponivel;

    }
    
    public Espaco() {}
    
    //metodos
    
    public String toString() {
        return "Espaco{" + "descEspaco=" + descEspaco + ", capacidade=" + capacidade + ",disponivel=" + disponivel + '}';
    }
    
          
    //acessadores e modificadores de atributos
    
    public String getDescEspaco() {
        return descEspaco;
    }

    public void setDescEspaco(String descEspaco) {
        this.descEspaco = descEspaco;
    }

    public String getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }
    
    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
}
