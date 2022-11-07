import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/products/create")
public class CreateProductServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        request.getRequestDispatcher("/products/productCreate.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        Products productsDao = DaoFactory.getProductsDao();

        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));

        Product product = new Product(name, price);

        productsDao.insert(product);
        response.sendRedirect("/products");
    }
}
