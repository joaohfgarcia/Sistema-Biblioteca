
package controle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Evento;

public class GerenciadorEventos {

    
    private static GerenciadorEventos uniqueInstance;
    private ArrayList<Evento> listaEventos;
       
    
    private GerenciadorEventos() {
        this.listaEventos = new ArrayList<Evento>() ;
 
    }
       
    
    public static GerenciadorEventos getInstance() {
            if(uniqueInstance == null) {
                uniqueInstance = new GerenciadorEventos();
            }
            return uniqueInstance;
        }
    
      
    
    public String adicionarEvento(Evento e){
        
        try {
            FileWriter editaArq = new FileWriter("evento.txt", true);     
            PrintWriter escreveArq = new PrintWriter(editaArq);

            escreveArq.println(e.getDescEvento());
            escreveArq.println(e.getData());
            escreveArq.println(e.getHora());
            escreveArq.println(e.getLocal());
            escreveArq.println(e.getResponsavel());
            escreveArq.println(e.getFone()); 
            escreveArq.println(e.getPublico());
            escreveArq.flush();
            escreveArq.close();
            editaArq.close();

        } catch (IOException ex) {
            Logger.getLogger(Evento.class.getName()).log(Level.SEVERE, null, ex);         
        }
      
        return ("Evento cadastrado com sucesso!");
        
    }
       
        
    public Evento buscarEvento(String descEvt){
        
        this.listaEventos.clear();
                                 
        try {
            Evento e;
            FileReader acessaArq = new FileReader("evento.txt");
            BufferedReader leiaArq = new BufferedReader(acessaArq);
            String linhaDesc = leiaArq.readLine();
            String linhaData;
            String linhaHora;
            String linhaLocal;
            String linhaResp;  
            String linhaFone;
            String linhaPublico;
            
            while (linhaDesc != null){
                
                linhaData = leiaArq.readLine();
                linhaHora = leiaArq.readLine();
                linhaLocal = leiaArq.readLine();
                linhaResp = leiaArq.readLine();
                linhaFone = leiaArq.readLine();
                linhaPublico = leiaArq.readLine();
                                
                e = new Evento(linhaDesc,linhaData,linhaHora,linhaLocal,linhaResp,linhaFone,linhaPublico);   
                          
                this.listaEventos.add(e);
                linhaDesc = leiaArq.readLine();
                
                }
            acessaArq.close();
            leiaArq.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GerenciadorEventos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GerenciadorEventos.class.getName()).log(Level.SEVERE, null, ex);
        }           
               
        for (int i = 0; i < listaEventos.size(); i++){
            if (listaEventos.get(i).getDescEvento().equals(descEvt)){
                return listaEventos.get(i);            
            }
        }
        
        return null;
    }
    
      
    
    public boolean removerEvento (String descEvt) {
        
        boolean result = false;
        File file = new File("evento.txt");
                
        for (int i = 0; i < this.listaEventos.size(); i++){
            
            if (this.listaEventos.get(i).getDescEvento().equals(descEvt)){
                this.listaEventos.remove(i);
                System.out.println(listaEventos);
                file.delete();
                result = true;
                
            }        
        }
        
        if (!listaEventos.isEmpty()){  
            
            for (int j = 0; j < this.listaEventos.size(); j++){

                try {
                    FileWriter editaArq = new FileWriter("evento.txt",true);
                    PrintWriter escreveArq = new PrintWriter(editaArq); 
                    escreveArq.println(this.listaEventos.get(j).getDescEvento());
                    escreveArq.println(this.listaEventos.get(j).getData());
                    escreveArq.println(this.listaEventos.get(j).getHora());
                    escreveArq.println(this.listaEventos.get(j).getLocal());
                    escreveArq.println(this.listaEventos.get(j).getResponsavel());
                    escreveArq.println(this.listaEventos.get(j).getFone());
                    escreveArq.println(this.listaEventos.get(j).getPublico());
                    editaArq.flush();
                    editaArq.close();
                    escreveArq.close();
                } catch (IOException ex) {
                    Logger.getLogger(GerenciadorEventos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }else{
            if (listaEventos.isEmpty()&& result){
                return result;
            }
        }  
        return result;   
    }
    
    
    public String importarEventos(String caminho){
        Path arquivo = Paths.get(caminho);
        try {
            byte[] texto = Files.readAllBytes(arquivo);
            String dadosExternos = new String(texto);
            FileWriter editaArq = new FileWriter("evento.txt", true);     
            PrintWriter escreveArq = new PrintWriter(editaArq);
            escreveArq.println(dadosExternos);
            escreveArq.flush();
            escreveArq.close();
            editaArq.close();
  
        } catch (IOException ex) {
            Logger.getLogger(Evento.class.getName()).log(Level.SEVERE, null, ex);
        }
           
        return "Importação realizada com sucesso!";
         
     }

            
    public String relatorioEventos() throws IOException{
            
        try {
            FileReader acessaArq = new FileReader("evento.txt");
            BufferedReader leiaArq = new BufferedReader(acessaArq);
            String linha = leiaArq.readLine();
            FileWriter relatorioEvt = new FileWriter("rel_eventos.txt");
            PrintWriter relatorio = new PrintWriter(relatorioEvt);
                      
            relatorio.println("---------------------  MORAIS LIBRARY  --------------------");
            relatorio.println("--------------------- AGENDA DE EVENTOS--------------------\n");
            int cont = 0;
            while (linha != null){
                cont++;
                relatorio.println("        Evento......: "+ linha);
                linha=leiaArq.readLine();
                relatorio.println("        Data........: "+ linha);
                linha=leiaArq.readLine();
                relatorio.println("        Hora........: "+ linha);
                linha=leiaArq.readLine();
                relatorio.println("        Espaço......: "+ linha);
                linha=leiaArq.readLine();
                relatorio.println("        Responsável.: "+ linha);
                linha=leiaArq.readLine();
                relatorio.println("        Fone........: "+ linha);
                linha=leiaArq.readLine();
                relatorio.println("        Publico.....: "+ linha+" pessoas\n");
                linha=leiaArq.readLine();
                
            }
            relatorio.println("        "+cont+" EVENTOS CADASTRADOS!\n");
            relatorio.println("---------------------------  //  --------------------------");
            relatorio.flush();
            relatorio.close();
            relatorioEvt.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Evento.class.getName()).log(Level.SEVERE, null, ex);
            return "Não existem eventos cadastrados!";
                    
        }
        return "Arquivo de relatório gerado com sucesso!\n"
              +"» rel_eventos.txt";
       
    }
    
    public static GerenciadorEventos getUniqueInstance() {
        return uniqueInstance;
    }

    public static void setUniqueInstance(GerenciadorEventos uniqueInstance) {
        GerenciadorEventos.uniqueInstance = uniqueInstance;
    }
    
    public ArrayList<Evento> getListaEventos() {
        return listaEventos;
    }

    public void setListaEventos(ArrayList<Evento> listaEventos) {
        this.listaEventos = listaEventos;
    }
    
    
}
