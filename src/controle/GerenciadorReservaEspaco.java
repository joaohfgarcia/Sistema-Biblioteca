
package controle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import modelo.Espaco;
import modelo.ReservaEspaco;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Usuario;


public class GerenciadorReservaEspaco {

    private static GerenciadorReservaEspaco uniqueInstance;
    private ArrayList<ReservaEspaco> listaReservas;

    private GerenciadorReservaEspaco() {
        this.listaReservas = new ArrayList<ReservaEspaco>();
    }
    
        public static GerenciadorReservaEspaco getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new GerenciadorReservaEspaco();
        }
        return uniqueInstance;
    }

    public boolean AdicionarReserva(Usuario usuario, Espaco espaco, String data, String hora, String descricao) {

        for (int i = 0; i < listaReservas.size(); i++) {
            if (listaReservas.get(i).getEspaco().getDescEspaco().equals(espaco.getDescEspaco())
                    && listaReservas.get(i).getData().equals(data) && listaReservas.get(i).getHora().equals(hora)) {
                return false;
            }
        }
        ReservaEspaco r = new ReservaEspaco(usuario, espaco, data, hora, descricao);
        listaReservas.add(r);
        try {
            FileWriter editaArq = new FileWriter("reservas_espacos.txt", false);
            PrintWriter escreveArq = new PrintWriter(editaArq);
            for (int i = 0; i < listaReservas.size(); i++) {
                escreveArq.println(listaReservas.get(i).getUsuario().getEmail());
                escreveArq.println(listaReservas.get(i).getEspaco().getDescEspaco());
                escreveArq.println(listaReservas.get(i).getData());
                escreveArq.println(listaReservas.get(i).getHora());
                escreveArq.println(listaReservas.get(i).getDescricao());
            }
            editaArq.flush();
            editaArq.close();
            escreveArq.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return true;
    }

    public void importarReservasEspacosInicio() {
        File f = new File("reservas_espacos.txt");
        Scanner input;
        try {
            input = new Scanner(f);
            while (input.hasNextLine()) {
                String emailusuario = input.nextLine();
                String espacodesc = input.nextLine();
                String data = input.nextLine();
                String hora = input.nextLine();
                String descricao = input.nextLine();

                GerenciadorUsuarios gu = GerenciadorUsuarios.getInstance();
                Usuario usuario = gu.buscarUsuario(emailusuario);
                GerenciadorEspacos ge = GerenciadorEspacos.getInstance();
                Espaco espaco = ge.buscarEspaco(espacodesc);

                ReservaEspaco r = new ReservaEspaco(usuario, espaco, data, hora, descricao);
                listaReservas.add(r);
            }
            input.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GerenciadorUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public String relatorioReservaEspaco() throws IOException{

        try {
            FileReader acessaArq = new FileReader("reservas_espacos.txt");
            BufferedReader leiaArq = new BufferedReader(acessaArq);
            String linha = leiaArq.readLine();
            FileWriter relatorioRsv = new FileWriter("rel_reservas_espacos.txt");
            PrintWriter relatorio = new PrintWriter(relatorioRsv);

            relatorio.println("---------------------  MORAIS LIBRARY  --------------------");
            relatorio.println("-------------------- ESPAÇOS RESERVADOS -------------------\n");
            int cont = 0;
            while (linha != null){
                cont++;
                relatorio.println("        Responsável.: "+ linha);
                linha=leiaArq.readLine();
                relatorio.println("        Espaço......: "+ linha); 
                linha=leiaArq.readLine();
                relatorio.println("        Data........: "+ linha);
                linha=leiaArq.readLine();
                relatorio.println("        Hora........: "+ linha);
                linha=leiaArq.readLine();
                relatorio.println("        Descrição...: "+ linha+"\n");
                linha=leiaArq.readLine();

            }
            relatorio.println("        "+cont+" RESERVAS DE ESPAÇO!\n");
            relatorio.println("---------------------------  //  --------------------------");
            relatorio.flush();
            relatorio.close();
            relatorioRsv.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReservaEspaco.class.getName()).log(Level.SEVERE, null, ex);
            return "Não existem reservas de espaço cadastradas!";

        }
        return "Arquivo de relatório gerado com sucesso!\n"
              +"» rel_reservas_espacos.txt";
       
    }
    
    
    
}
