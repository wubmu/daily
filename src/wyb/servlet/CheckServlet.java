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
 * Created by 吴亚斌 on 2017/9/8.
 */
@WebServlet(name = "CheckServlet")
public class CheckServlet extends HttpServlet {
    private BookDao bookDao=new BookDao();
    private String error=null;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // 获取存放在session中的验证码
        String code = (String) req.getSession().getAttribute("code");
        // 获取页面提交的验证码
        String inputCode = req.getParameter("code");
        User user =new User();
        user.setUsername(req.getParameter("username"));
        user.setPassword(req.getParameter("password"));
        if(code.toLowerCase().equals(inputCode.toLowerCase())) { // 验证码不区分大小写
            // 验证成功，跳转到成功页
        }else {
            error="验证码不正确，请重新输入";
            req.setAttribute("error",error);
        }
        if (bookDao.login(user)){
            req.getSession().setAttribute("user",user);
            resp.sendRedirect("addBook.jsp");
            
        }

    }

}