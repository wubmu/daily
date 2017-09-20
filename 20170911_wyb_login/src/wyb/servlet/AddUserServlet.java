package wyb.servlet;

import wyb.dao.BookDao;
import wyb.vo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by 吴亚斌 on 2017/9/10.
 */
@WebServlet(name = "AddUserServlet",urlPatterns = "/addUserServlet")
public class AddUserServlet extends HttpServlet {
    private  BookDao bookDao=new BookDao();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user =new User();
        user.setPassword(request.getParameter("password"));
        user.setUsername(request.getParameter("username"));
       bookDao.addUser(user);
       response.sendRedirect("index.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
