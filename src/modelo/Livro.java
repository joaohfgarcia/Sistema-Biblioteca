
package modelo;

import java.sql.Array;

public class Livro {
    
    //atributos
    
    private String titulo, autor, editora, cidade, uf;
    private int ano;
    private int edicao;
    private String isbn;
    private String categoria;  
    private String tematica;
    private boolean disponivel;
    private int qtEstoque;
    private int qtAlugada;
    private int qtReservada;
         
    //contrutores

    public Livro(String titulo, String autor, String editora, String cidade, 
            String uf, int ano, int edicao, String isbn, String categoria, 
            String tematica, boolean disponivel, int qtEstoque, int qtAlugada, 
            int qtReservada) {
        
        
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.cidade = cidade;
        this.uf = uf;
        this.ano = ano;
        this.edicao = edicao;
        this.isbn = isbn;
        this.categoria = categoria;
        this.tematica = tematica;
        this.disponivel = disponivel;
        this.qtEstoque = qtEstoque;
        this.qtAlugada = qtAlugada;
        this.qtReservada = qtReservada;
        
    }
    
    
  
    public Livro(){}
    
    //metodos 
    
    @Override
    public String toString() {
        return "Livro{" + "titulo=" + titulo + ", autor=" + autor + ", editora=" + editora 
                + ", cidade=" + cidade + ", uf=" + uf + ", isbn=" + isbn + ", ano=" + ano 
                + ", edicao=" + edicao + ", categoria=" + categoria + ", tematica=" + tematica 
                + ", disponivel=" + disponivel + ", qtEstoque=" + qtEstoque
                + ", qtAlugada=" + qtAlugada + ", qtReservada=" + qtReservada+"}";
    } 
    

    //acessadores e modificadores de atributos

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public int getQtEstoque() {
        return qtEstoque;
    }

    public void setQtEstoque(int qtEstoque) {
        this.qtEstoque = qtEstoque;
    }

    public int getQtAlugada() {
        return qtAlugada;
    }

    public void setQtAlugada(int qtAlugada) {
        this.qtAlugada = qtAlugada;
    }

    public int getQtReservada() {
        return qtReservada;
    }

    public void setQtReservada(int qtReservada) {
        this.qtReservada = qtReservada;
    }

    
    
    
}
