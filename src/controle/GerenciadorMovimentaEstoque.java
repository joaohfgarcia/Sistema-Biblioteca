package controle;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.MovimentaEstoque;


public class GerenciadorMovimentaEstoque {
    
    private static GerenciadorMovimentaEstoque uniqueInstance;
    private ArrayList<MovimentaEstoque> listaMovimentacao;
       
    
    private GerenciadorMovimentaEstoque() {
        this.listaMovimentacao = new ArrayList<MovimentaEstoque>();
    }
        
    public static GerenciadorMovimentaEstoque getInstance() {
            if(uniqueInstance == null) {
                uniqueInstance = new GerenciadorMovimentaEstoque();
            }
            return uniqueInstance;
        }
    
    public String adicionarMovimentacao(MovimentaEstoque mv1){ 
 
        try {
            FileWriter editaArq = new FileWriter("movimentacao.txt", true);
            PrintWriter escreveArq = new PrintWriter(editaArq); 
            escreveArq.println(mv1.getFavorecido());
            escreveArq.println(mv1.getPublicacao());
            escreveArq.println(mv1.getTipo());
            escreveArq.println(mv1.getData());
            editaArq.flush();
            editaArq.close();
            escreveArq.close();
        } catch (IOException ex) {
            Logger.getLogger(GerenciadorEspacos.class.getName()).log(Level.SEVERE, null, ex);
        }
  
        return ("Cadastrado realizado com sucesso!");
    }
    
}
