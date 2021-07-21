
package modelo;

public class Evento {
    
    // atributos
    
    private String descEvento;
    private String data;
    private String hora;
    private String local;
    private String responsavel;
    private String fone;
    private String publico;

    
    //construtores 
    
    public Evento(String descEvento, String data, String hora,String local,String responsavel, String fone, String publico) {
        this.descEvento = descEvento;
        this.data = data;
        this.local = local;
        this.hora = hora;
        this.responsavel = responsavel;
        this.fone = fone;
        this.publico = publico;
    }
    
    public Evento (){}
    
    //metodos
    
    @Override
    public String toString() {
        return "Evento{" + "descEvento=" + descEvento + ", responsavel=" + responsavel + ", hora=" + hora + ", fone=" + fone + ", publico=" + publico + ", data=" + data + ", local=" + local + '}';
    }
    
       //acessadores e modificadores de atributos

    public String getDescEvento() {
        return descEvento;
    }

    public void setDescEvento(String descEvento) {
        this.descEvento = descEvento;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getPublico() {
        return publico;
    }

    public void setPublico(String publico) {
        this.publico = publico;
    }  
    
}
