import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CounterServlet", urlPatterns = "/count")
public class CounterServlet extends HttpServlet
{
    private int count;

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        count += 1;
        // Create a page that displays "Hello World!" when a user visits /hello
        res.setContentType("text/html");
        if(count == 1)
            res.getWriter().println("<h1>The count is " + count + ".</h1>");
        else
            res.getWriter().println("<h1>After visiting the page again, the count is now " + count + ".</h1>");
    }

}
