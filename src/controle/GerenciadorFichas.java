
package controle;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Ficha;

public class GerenciadorFichas {
    
    private static GerenciadorFichas uniqueInstance;
    private ArrayList<Ficha> listaFichas;
       
    
    private GerenciadorFichas() {
        this.listaFichas = new ArrayList<Ficha>() ;
    }
       
    
    public static GerenciadorFichas getInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new GerenciadorFichas();
        }
        return uniqueInstance;
    }
    
     public String adicionarFicha(Ficha f){
        
        try {
            FileWriter editaArq = new FileWriter("ficha.txt", true);     
            PrintWriter escreveArq = new PrintWriter(editaArq);
            escreveArq.println(f.getTitulo());
            escreveArq.println(f.getAutor());
            escreveArq.println(f.getUniversidade());
            escreveArq.println(f.getTipo());
            escreveArq.println(f.getAssunto1());
            escreveArq.println(f.getAssunto2()); 
            escreveArq.println(f.getAssunto3());
            escreveArq.println(f.getOrientador());
            escreveArq.println(f.getFolhas());
            escreveArq.println(f.getAno());
            escreveArq.println(f.getCidade());
            escreveArq.println(f.getUf());
            escreveArq.println(f.getSituacao());
            escreveArq.println(f.getData());
            escreveArq.flush();
            escreveArq.close();
            editaArq.close();

        } catch (IOException ex) {
            Logger.getLogger(Ficha.class.getName()).log(Level.SEVERE, null, ex);         
        }
      
        return ("Ficha solicitada com sucesso!");
        
    }
    
   
    public Ficha buscarFicha(String titulo){
        
        this.listaFichas.clear();
                                 
        try {
            Ficha f;
            FileReader acessaArq = new FileReader("ficha.txt");
            BufferedReader leiaArq = new BufferedReader(acessaArq);
            
            String lnTitulo;
            String lnAutor; 
            String lnUniversidade;
            String lnTipo;
            String lnAssunto1;
            String lnAssunto2;
            String lnAssunto3;
            String lnOrientador;
            int lnFolhas;
            int lnAno;
            String lnCidade;
            String lnUf;
            String lnSituacao;
            String lnData;
  
            lnTitulo = leiaArq.readLine();          
            
            while (lnTitulo != null){
                
                lnAutor = leiaArq.readLine(); 
                lnUniversidade = leiaArq.readLine();
                lnTipo = leiaArq.readLine();
                lnAssunto1 = leiaArq.readLine();
                lnAssunto2 = leiaArq.readLine();
                lnAssunto3 = leiaArq.readLine();
                lnOrientador = leiaArq.readLine();
                lnFolhas = Integer.parseInt(leiaArq.readLine());
                lnAno = Integer.parseInt(leiaArq.readLine());
                lnCidade = leiaArq.readLine();
                lnUf = leiaArq.readLine();
                lnSituacao = leiaArq.readLine();
                lnData = leiaArq.readLine();
                                                           
                f = new Ficha(lnTitulo, lnAutor, lnUniversidade, lnTipo, lnAssunto1, lnAssunto2, 
                        lnAssunto3, lnOrientador, lnFolhas, lnAno, lnCidade, lnUf, lnSituacao, lnData);
                this.listaFichas.add(f);
                lnTitulo = leiaArq.readLine();
                
                }
            acessaArq.close();
            leiaArq.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GerenciadorFichas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GerenciadorFichas.class.getName()).log(Level.SEVERE, null, ex);
        }           
               
        for (int i = 0; i < listaFichas.size(); i++){
            if (listaFichas.get(i).getTitulo().equals(titulo)){
                return listaFichas.get(i);            
            }
        }
        
        return null;
    }  
    
    public String relatorioFichas() throws IOException{
            
        try {
            FileReader acessaArq = new FileReader("ficha.txt");
            BufferedReader leiaArq = new BufferedReader(acessaArq);
            String linha = leiaArq.readLine();
            FileWriter relatorioFch = new FileWriter("rel_fichas.txt");
            PrintWriter relatorio = new PrintWriter(relatorioFch);
                      
            relatorio.println("---------------------   MORAIS LIBRARY  ----------------------");
            relatorio.println("--------------------- RELATÓRIO DE FICHAS --------------------\n");
            int cont = 0;
            while (linha != null){
                cont++;
                relatorio.println("        Titulo.......: "+ linha);
                linha=leiaArq.readLine();
                relatorio.println("        Autor........: "+ linha);
                linha=leiaArq.readLine();
                linha=leiaArq.readLine();
                relatorio.println("        Tipo.........: "+ linha);
                linha=leiaArq.readLine();
                linha=leiaArq.readLine();
                linha=leiaArq.readLine();
                linha=leiaArq.readLine();
                relatorio.println("        Orientador...: "+ linha);
                linha=leiaArq.readLine();
                linha=leiaArq.readLine();
                linha=leiaArq.readLine();
                linha=leiaArq.readLine();
                linha=leiaArq.readLine();
                relatorio.println("        Situação.....: "+ linha);
                linha=leiaArq.readLine();
                relatorio.println("        Solicitação..: "+ linha+"\n");
                linha=leiaArq.readLine();
                
            }
            relatorio.println("        "+cont+" FICHAS CADASTRADAS!\n");
            relatorio.println("---------------------------  //  --------------------------");
            relatorio.flush();
            relatorio.close();
            relatorioFch.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ficha.class.getName()).log(Level.SEVERE, null, ex);
            return "Não existem fichas cadastrados!";
                    
        }
        return "Arquivo de relatório gerado com sucesso!\n"
              +"» rel_fichas.txt";
       
    }
    
    
    
}
