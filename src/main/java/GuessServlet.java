import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "GuessServlet", value = "/guess")
public class GuessServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        request.getRequestDispatcher("/guessing-game.jsp").forward(request,response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        int userNum = Integer.parseInt(request.getParameter("guess"));
        int answer = (int) Math.floor((Math.random() * 3) + 1);

        if(userNum == answer)
        {
            response.sendRedirect("/correct");
        }
        else
            response.sendRedirect("/incorrect");
    }
}
