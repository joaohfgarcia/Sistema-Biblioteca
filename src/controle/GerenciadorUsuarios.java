package controle;

import java.util.ArrayList;
import modelo.Aluno;
import modelo.Funcionario;
import modelo.Professor;
import modelo.UserExterno;
import modelo.Usuario;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Evento;

public class GerenciadorUsuarios {

    private static GerenciadorUsuarios uniqueInstance;
    private ArrayList<Aluno> listaAlunos;
    private ArrayList<Professor> listaProfessores;
    private ArrayList<Funcionario> listaFuncionarios;
    private ArrayList<UserExterno> listaUserExternos;
    private String tipoUsuario;
    private Usuario usuarioLogado;

    private GerenciadorUsuarios() {
        this.listaAlunos = new ArrayList<Aluno>();
        this.listaProfessores = new ArrayList<Professor>();
        this.listaFuncionarios = new ArrayList<Funcionario>();
        this.listaUserExternos = new ArrayList<UserExterno>();
        this.tipoUsuario = "" ;
        this.usuarioLogado = null ;
      
    }

    public static GerenciadorUsuarios getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new GerenciadorUsuarios();
        }
        return uniqueInstance;
    }

    public boolean addUsuario(Usuario u) {
        
        if (u instanceof Aluno) {
            for (int i = 0; i < listaAlunos.size(); i++) {
                if (listaAlunos.get(i).getEmail().equals(u.getEmail())) {
                    return false;
                }
            }
            listaAlunos.add((Aluno) u);
            try {
                FileWriter editaArq = new FileWriter("usu_alunos.txt", false);
                PrintWriter escreveArq = new PrintWriter(editaArq);
                for (int i = 0; i < listaAlunos.size(); i++) {
                    escreveArq.println(listaAlunos.get(i).getEmail());
                    escreveArq.println(listaAlunos.get(i).getCurso());
                    escreveArq.println(listaAlunos.get(i).getMatricula());
                    escreveArq.println(listaAlunos.get(i).getCpf());
                    escreveArq.println(listaAlunos.get(i).getEndereco());
                    escreveArq.println(listaAlunos.get(i).getNascimento());
                    escreveArq.println(listaAlunos.get(i).getNome());
                    escreveArq.println(listaAlunos.get(i).getSenha());
                    escreveArq.println(listaAlunos.get(i).getTelefone());

                }
                editaArq.flush();
                editaArq.close();
                escreveArq.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }

            
            return true;
        } else if (u instanceof Professor) {
            for (int i = 0; i < listaProfessores.size(); i++) {
                if (listaProfessores.get(i).getEmail().equals(u.getEmail())) {
                    return false;
                }
            }
            listaProfessores.add((Professor) u);
            try {
                FileWriter editaArq = new FileWriter("usu_professores.txt", false);
                PrintWriter escreveArq = new PrintWriter(editaArq);
                for (int i = 0; i < listaProfessores.size(); i++) {
                    escreveArq.println(listaProfessores.get(i).getEmail());
                    escreveArq.println(listaProfessores.get(i).getDepartamento());
                    escreveArq.println(listaProfessores.get(i).getCpf());
                    escreveArq.println(listaProfessores.get(i).getEndereco());
                    escreveArq.println(listaProfessores.get(i).getNascimento());
                    escreveArq.println(listaProfessores.get(i).getNome());
                    escreveArq.println(listaProfessores.get(i).getSenha());
                    escreveArq.println(listaProfessores.get(i).getTelefone());

                }
                editaArq.flush();
                editaArq.close();
                escreveArq.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }

            return true;

        } else if (u instanceof UserExterno) {
            for (int i = 0; i < listaUserExternos.size(); i++) {
                if (listaUserExternos.get(i).getEmail().equals(u.getEmail())) {
                    return false;
                }
            }
            listaUserExternos.add((UserExterno) u);
            try {
                FileWriter editaArq = new FileWriter("usu_externos.txt", false);
                PrintWriter escreveArq = new PrintWriter(editaArq);
                for (int i = 0; i < listaUserExternos.size(); i++) {
                    escreveArq.println(listaUserExternos.get(i).getEmail());
                    escreveArq.println(listaUserExternos.get(i).getMensalidade());
                    escreveArq.println(listaUserExternos.get(i).getCpf());
                    escreveArq.println(listaUserExternos.get(i).getEndereco());
                    escreveArq.println(listaUserExternos.get(i).getNascimento());
                    escreveArq.println(listaUserExternos.get(i).getNome());
                    escreveArq.println(listaUserExternos.get(i).getSenha());
                    escreveArq.println(listaUserExternos.get(i).getTelefone());

                }
                editaArq.flush();
                editaArq.close();
                escreveArq.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }

            return true;
        } else if (u instanceof Funcionario) {
            for (int i = 0; i < listaFuncionarios.size(); i++) {
                if (listaFuncionarios.get(i).getEmail().equals(u.getEmail())) {
                    return false;
                }
            }
            listaFuncionarios.add((Funcionario) u);
            try {
                FileWriter editaArq = new FileWriter("usu_funcionarios.txt", false);
                PrintWriter escreveArq = new PrintWriter(editaArq);
                for (int i = 0; i < listaFuncionarios.size(); i++) {
                    escreveArq.println(listaFuncionarios.get(i).getEmail());
                    escreveArq.println(listaFuncionarios.get(i).getCargo());
                    escreveArq.println(listaFuncionarios.get(i).getCpf());
                    escreveArq.println(listaFuncionarios.get(i).getEndereco());
                    escreveArq.println(listaFuncionarios.get(i).getNascimento());
                    escreveArq.println(listaFuncionarios.get(i).getNome());
                    escreveArq.println(listaFuncionarios.get(i).getSenha());
                    escreveArq.println(listaFuncionarios.get(i).getTelefone());

                }
                editaArq.flush();
                editaArq.close();
                escreveArq.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }

            return true;
        }
        //fecha arquivo
        return false;
    }

    public Usuario buscarUsuario(String email) {

        for (int i = 0; i < listaProfessores.size(); i++) {
            if (listaProfessores.get(i).getEmail().equals(email)) {
                return listaProfessores.get(i);
            }
        }
        for (int i = 0; i < listaAlunos.size(); i++) {
            if (listaAlunos.get(i).getEmail().equals(email)) {
                return listaAlunos.get(i);
            }
        }
        for (int i = 0; i < listaFuncionarios.size(); i++) {
            if (listaFuncionarios.get(i).getEmail().equals(email)) {
                return listaFuncionarios.get(i);
            }
        }
        for (int i = 0; i < listaUserExternos.size(); i++) {
            if (listaUserExternos.get(i).getEmail().equals(email)) {
                return listaUserExternos.get(i);
            }
        }

        return null;
    }

    public boolean removerUsuario(String email) {
        Usuario u = buscarUsuario(email);
        boolean removeu = false;
        if (u instanceof Professor) {
            File file = new File("usu_professores.txt");
            for (int i = 0; i < listaProfessores.size(); i++) {
                if (listaProfessores.get(i).getEmail().equals(email)) {
                    listaProfessores.remove(i);
                    removeu = true;
                }
            }
            if (!listaProfessores.isEmpty()) {
                for (int i = 0; i < listaProfessores.size(); i++) {
                    try {
                        FileWriter editaArq = new FileWriter("usu_professores.txt", false);
                        PrintWriter escreveArq = new PrintWriter(editaArq);
                        escreveArq.println(listaProfessores.get(i).getEmail());
                        escreveArq.println(listaProfessores.get(i).getDepartamento());
                        escreveArq.println(listaProfessores.get(i).getCpf());
                        escreveArq.println(listaProfessores.get(i).getEndereco());
                        escreveArq.println(listaProfessores.get(i).getNascimento());
                        escreveArq.println(listaProfessores.get(i).getNome());
                        escreveArq.println(listaProfessores.get(i).getSenha());
                        escreveArq.println(listaProfessores.get(i).getTelefone());
                        editaArq.flush();
                        editaArq.close();
                        escreveArq.close();
                    } catch (IOException ex) {
                        Logger.getLogger(GerenciadorEventos.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }

        if (u instanceof Aluno) {
            File file = new File("usu_alunos.txt");
            for (int i = 0; i < listaAlunos.size(); i++) {
                if (listaAlunos.get(i).getEmail().equals(email)) {
                    listaAlunos.remove(i);
                    removeu = true;
                }
            }
            if (!listaAlunos.isEmpty()) {
                for (int i = 0; i < listaAlunos.size(); i++) {
                    try {
                        FileWriter editaArq = new FileWriter("usu_alunos.txt", false);
                        PrintWriter escreveArq = new PrintWriter(editaArq);
                        escreveArq.println(listaAlunos.get(i).getEmail());
                        escreveArq.println(listaAlunos.get(i).getCurso());
                        escreveArq.println(listaAlunos.get(i).getMatricula());
                        escreveArq.println(listaAlunos.get(i).getCpf());
                        escreveArq.println(listaAlunos.get(i).getEndereco());
                        escreveArq.println(listaAlunos.get(i).getNascimento());
                        escreveArq.println(listaAlunos.get(i).getNome());
                        escreveArq.println(listaAlunos.get(i).getSenha());
                        escreveArq.println(listaAlunos.get(i).getTelefone());
                        editaArq.flush();
                        editaArq.close();
                        escreveArq.close();
                    } catch (IOException ex) {
                        Logger.getLogger(GerenciadorEventos.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        if (u instanceof Funcionario) {

            File file = new File("usu_funcionarios.txt");
            for (int i = 0; i < listaFuncionarios.size(); i++) {
                if (listaFuncionarios.get(i).getEmail().equals(email)) {
                    listaFuncionarios.remove(i);
                    removeu = true;               
                }
            }
            if (!listaFuncionarios.isEmpty()) {
                for (int i = 0; i < listaFuncionarios.size(); i++) {
                    try {
                        FileWriter editaArq = new FileWriter("usu_funcionarios.txt", false);
                        PrintWriter escreveArq = new PrintWriter(editaArq);
                        escreveArq.println(listaFuncionarios.get(i).getEmail());
                        escreveArq.println(listaFuncionarios.get(i).getCargo());
                        escreveArq.println(listaFuncionarios.get(i).getCpf());
                        escreveArq.println(listaFuncionarios.get(i).getEndereco());
                        escreveArq.println(listaFuncionarios.get(i).getNascimento());
                        escreveArq.println(listaFuncionarios.get(i).getNome());
                        escreveArq.println(listaFuncionarios.get(i).getSenha());
                        escreveArq.println(listaFuncionarios.get(i).getTelefone());
                        editaArq.flush();
                        editaArq.close();
                        escreveArq.close();
                    } catch (IOException ex) {
                        Logger.getLogger(GerenciadorEventos.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        if (u instanceof UserExterno) {

            File file = new File("usu_externos.txt");
            for (int i = 0; i < listaUserExternos.size(); i++) {
                if (listaUserExternos.get(i).getEmail().equals(email)) {
                    listaUserExternos.remove(i);
                    removeu = true;                
                }
            }
            if (!listaUserExternos.isEmpty()) {
                for (int i = 0; i < listaUserExternos.size(); i++) {
                    try {
                        FileWriter editaArq = new FileWriter("usu_externos.txt", false);
                        PrintWriter escreveArq = new PrintWriter(editaArq);
                        escreveArq.println(listaUserExternos.get(i).getEmail());
                        escreveArq.println(listaUserExternos.get(i).getMensalidade());
                        escreveArq.println(listaUserExternos.get(i).getCpf());
                        escreveArq.println(listaUserExternos.get(i).getEndereco());
                        escreveArq.println(listaUserExternos.get(i).getNascimento());
                        escreveArq.println(listaUserExternos.get(i).getNome());
                        escreveArq.println(listaUserExternos.get(i).getSenha());
                        escreveArq.println(listaUserExternos.get(i).getTelefone());
                        editaArq.flush();
                        editaArq.close();
                        escreveArq.close();
                    } catch (IOException ex) {
                        Logger.getLogger(GerenciadorEventos.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        return removeu;

    }

    public String relatorioUsuarios() throws IOException {

        try {
            FileReader acessaArq = new FileReader("users.txt");
            BufferedReader leiaArq = new BufferedReader(acessaArq);
            String linha = leiaArq.readLine();
            FileWriter relatorioEvt = new FileWriter("relatorio.txt");
            PrintWriter relatorio = new PrintWriter(relatorioEvt);

            relatorio.println("---------------------  MORAIS LIBRARY  --------------------");
            relatorio.println("--------------------- LISTA DE USUÁRIOS--------------------\n");
            int cont = 0;
            relatorio.flush();
            relatorio.close();
            relatorioEvt.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Evento.class.getName()).log(Level.SEVERE, null, ex);
            return "Não existe usuários cadastrados";

        }
        return "Relatório gerado com sucesso!";
    }

    public Usuario login(String login, String senha) {

        for (int i = 0; i < listaAlunos.size(); i++) {
            if (listaAlunos.get(i).getEmail().equals(login) && listaAlunos.get(i).getSenha().equals(senha)) {
                this.tipoUsuario = "Aluno";
                this.usuarioLogado = listaAlunos.get(i);
                return listaAlunos.get(i);
            }
        }

        for (int i = 0; i < listaProfessores.size(); i++) {
            if (listaProfessores.get(i).getEmail().equals(login) && listaProfessores.get(i).getSenha().equals(senha)) {
                this.tipoUsuario = "Professor";
                this.usuarioLogado = listaProfessores.get(i);
                return listaProfessores.get(i);
            }
        }

        for (int i = 0; i < listaFuncionarios.size(); i++) {
            if (listaFuncionarios.get(i).getEmail().equals(login) && listaFuncionarios.get(i).getSenha().equals(senha)) {
                this.tipoUsuario = "Funcionario";
                this.usuarioLogado = listaFuncionarios.get(i);
                return listaFuncionarios.get(i);
            }
        }

        for (int i = 0; i < listaUserExternos.size(); i++) {
            if (listaUserExternos.get(i).getEmail().equals(login) && listaUserExternos.get(i).getSenha().equals(senha)) {
                this.tipoUsuario = "Externo";
                this.usuarioLogado = listaUserExternos.get(i);
                return listaUserExternos.get(i);
            }
        }

        return null;
    }

    public String getTipoUsuario(){
        return this.tipoUsuario;
    }
    public Usuario getUsuarioLogado(){
        return this.usuarioLogado;
    }
    
    public void importInicio() {
        File f = new File("usu_professores.txt");
        Scanner input;
        try {
            input = new Scanner(f);

            while (input.hasNextLine()) {
                String email = input.nextLine();
                String departamento = input.nextLine();
                String cpf = input.nextLine();
                String endereco = input.nextLine();
                String nascimento = input.nextLine();
                String nome = input.nextLine();
                String senha = input.nextLine();
                String telefone = input.nextLine();

                Professor p1 = new Professor(departamento, senha, nome, endereco, email, telefone, nascimento, cpf);
                listaProfessores.add(p1);

            }
            input.close();

            f = new File("usu_alunos.txt");

            input = new Scanner(f);

            while (input.hasNextLine()) {
                String email = input.nextLine();
                String curso = input.nextLine();
                String matricula = input.nextLine();
                String cpf = input.nextLine();
                String endereco = input.nextLine();
                String nascimento = input.nextLine();
                String nome = input.nextLine();
                String senha = input.nextLine();
                String telefone = input.nextLine();

                Aluno a1 = new Aluno(curso, matricula, senha, nome, endereco, email, telefone, nascimento, cpf);
                listaAlunos.add(a1);

            }
            input.close();
            
            f = new File("usu_externos.txt");

            input = new Scanner(f);

            while (input.hasNextLine()) {
                String email = input.nextLine();
                String mensalidade= input.nextLine();
                String cpf = input.nextLine();
                String endereco = input.nextLine();
                String nascimento = input.nextLine();
                String nome = input.nextLine();
                String senha = input.nextLine();
                String telefone = input.nextLine();
                UserExterno e1 = new UserExterno(senha, nome, endereco, email, telefone, nascimento, cpf,mensalidade);
                listaUserExternos.add(e1);

            }
            input.close();
            
            f = new File("usu_funcionarios.txt");

            input = new Scanner(f);

            while (input.hasNextLine()) {
                String email = input.nextLine();
                String cargo= input.nextLine();
                String cpf = input.nextLine();
                String endereco = input.nextLine();
                String nascimento = input.nextLine();
                String nome = input.nextLine();
                String senha = input.nextLine();
                String telefone = input.nextLine();
                Funcionario f1 = new Funcionario(cargo,senha, nome, endereco, email, telefone, nascimento, cpf);
                listaFuncionarios.add(f1);

            }
            input.close();


        } catch (FileNotFoundException ex) {
            Logger.getLogger(GerenciadorUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
