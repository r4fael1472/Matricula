package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.ClassAluno;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * Default constructor.
     */
    public Login() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("login");
        String matricula = request.getParameter("senha");

        ClassAluno aluno = new ClassAluno(nome, matricula);

        PrintWriter out = response.getWriter();

        if(nome.isEmpty() || matricula.isEmpty()) {
            request.setAttribute("Erro", "o usuário ou a senha estavam errados");

            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
        else {
            HttpSession session = request.getSession();
            session.setAttribute("nome", aluno.getNome());
            response.sendRedirect("cadastro.jsp?nome="+nome);
        }
    }

}
