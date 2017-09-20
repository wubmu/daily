package wyb.filter;

import wyb.vo.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by 吴亚斌 on 2017/9/18.
 */
@WebFilter(filterName = "UserFilter",urlPatterns = "/addBook.jsp")
public class UserFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request= (HttpServletRequest) req;
        User user= (User) request.getAttribute("user");
        if (user==null)
            request.getRequestDispatcher("index.jsp").forward(request,resp);
        else
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
