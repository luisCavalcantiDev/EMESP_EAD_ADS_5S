package metodista.ead.ads5.web.controllers;

import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author LuisGustavo
 */
@WebServlet(name = "/LoginController", urlPatterns = {"/LoginController"})
public class LoginController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public LoginController() {
        super();
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException {
        try {

            String user = request.getParameter("user");
            String pass = request.getParameter("pass");                        
            
            PrintWriter output = response.getWriter();
            output.println("<html>");
            output.println("<head>");
            output.println("</head>");
            output.println("<body>");
            output.println("<div>Login efetuado com sucesso!!! (teste)</div>");
            output.println("<div>Usuário: " + user + "</div>");
            output.println("<div>Senha: " + pass + "</div>");
            output.println("</body>");
            output.println("</html>");

        } catch (Exception e) {
            throw new ServletException("Erro ao processar requisição: " + e.getMessage());
        }
    }
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException {
        try {

            String user = request.getParameter("user");
            String pass = request.getParameter("pass");                        
            
            PrintWriter output = response.getWriter();
            output.println("<html>");
            output.println("<head>");
            output.println("</head>");
            output.println("<body>");
            output.println("<div>Login efetuado com sucesso!!! (teste)</div>");
            output.println("<div>Usuário: " + user + "</div>");
            output.println("<div>Senha: " + pass + "</div>");
            output.println("</body>");
            output.println("</html>");

        } catch (Exception e) {
            throw new ServletException("Erro ao processar requisição: " + e.getMessage());
        }
    }
}
