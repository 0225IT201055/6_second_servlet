import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;


public class secondservlet extends HttpServlet{
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException ,IOException{

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<h1>My First Servlet Made Html response...</h1>");
        out.println("<hr>");

        out.flush();
        out.close();
    }
}