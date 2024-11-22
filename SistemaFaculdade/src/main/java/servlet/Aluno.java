package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.ClassAluno;
import model.ClassDisciplina;



/**
 * Servlet implementation class Aluno
 */
@WebServlet("/Aluno")
public class Aluno extends HttpServlet {
    private static final long serialVersionUID = 1L;

    List<ClassAluno> alunosCadastrados = new ArrayList<>();
    List<ClassDisciplina> disciplinas = new ArrayList<>();

    /**
     * Default constructor.
     */
    public Aluno() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String matricula = request.getParameter("matricula");
        String nome = request.getParameter("nome");
        Integer periodo = Integer.parseInt(request.getParameter("periodo"));
        String nomedisc = request.getParameter("nomedisc");
        Integer periododisc = Integer.parseInt(request.getParameter("periododisc"));
        String dataperiododisc = request.getParameter("dataperiododisc");
        char status = request.getParameter("status").charAt(0);

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        ClassDisciplina d = new ClassDisciplina(nomedisc, periododisc, dataperiododisc, status);

        Integer check = d.verificaDisciplina(status);

        if (check == 0) {
            disciplinas.add(d);
        }
        else {
            out.println("Essa disciplina não pode ser cadastrada.");
        }


        ClassAluno a = new ClassAluno(matricula,nome, periodo, disciplinas);


        alunosCadastrados.add(a);



        out.println("<h2>Novo aluno cadastrado</h2>Nome: "+a.getNome()+"<br/>Idade: "+a.getMatricula());

        out.println("<h3>Alunos já cadastrados</h3>");
        for(ClassAluno aux : alunosCadastrados) {
            out.println(aux.getNome()+" "+aux.getMatricula()+"<br/>");

        }
        for (ClassDisciplina aux2 : a.getDisc()) {
            out.println(aux2.getNome()+"<br/>");
        }


    }

}