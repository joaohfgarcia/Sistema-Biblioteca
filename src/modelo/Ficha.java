
package modelo;

public class Ficha {
    
    private String titulo;
    private String autor; 
    private String universidade;
    private String tipo;
    private String assunto1;
    private String assunto2;
    private String assunto3;
    private String orientador;
    private int folhas;
    private int ano;
    private String cidade;
    private String uf;
    private String situacao;
    private String data;

    public Ficha(String titulo, String autor, String universidade, String tipo, 
            String assunto1, String assunto2, String assunto3, String orientador, 
            int folhas, int ano, String cidade, String uf, String situacao, String data) {
        this.titulo = titulo;
        this.autor = autor;
        this.universidade = universidade;
        this.tipo = tipo;
        this.assunto1 = assunto1;
        this.assunto2 = assunto2;
        this.assunto3 = assunto3;
        this.orientador = orientador;
        this.folhas = folhas;
        this.ano = ano;
        this.cidade = cidade;
        this.uf = uf;
        this.situacao = situacao;
        this.data = data;
    }
    
    public Ficha(){}

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAssunto1() {
        return assunto1;
    }

    public void setAssunto1(String assunto1) {
        this.assunto1 = assunto1;
    }

    public String getAssunto2() {
        return assunto2;
    }

    public void setAssunto2(String assunto2) {
        this.assunto2 = assunto2;
    }

    public String getAssunto3() {
        return assunto3;
    }

    public void setAssunto3(String assunto3) {
        this.assunto3 = assunto3;
    }

    public String getOrientador() {
        return orientador;
    }

    public void setOrientador(String orientador) {
        this.orientador = orientador;
    }

    public int getFolhas() {
        return folhas;
    }

    public void setFolhas(int folhas) {
        this.folhas = folhas;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return "Ficha{" + "titulo=" + titulo + ", autor=" + autor + ", universidade=" 
                + universidade + ", tipo=" + tipo + ", assunto1=" + assunto1 + ", assunto2=" 
                + assunto2 + ", assunto3=" + assunto3 + ", orientador=" + orientador + ", folhas=" 
                + folhas + ", ano=" + ano + ", cidade=" + cidade + ", uf=" + uf + ", situacao=" + situacao 
                + ", data=" + data + '}';
    }

    
    
}
