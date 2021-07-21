
package modelo;


public class MovimentaEstoque {
    
    private String favorecido;
    private String data;
    private String publicacao;
    private String tipo;

    public MovimentaEstoque(String favorecido, String data, String publicacao, String tipo) {
        this.favorecido = favorecido;
        this.data = data;
        this.publicacao = publicacao;
        this.tipo = tipo;
    }

    public MovimentaEstoque() {}

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
        
    public String getPublicacao() {
        return publicacao;
    }

    public void setPublicacao(String publicacao) {
        this.publicacao = publicacao;
    }

    public String getFavorecido() {
        return favorecido;
    }

    public void setFavorecido(String favorecido) {
        this.favorecido = favorecido;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    
    
}
