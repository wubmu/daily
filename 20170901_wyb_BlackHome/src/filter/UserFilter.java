package filter;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by 吴亚斌 on 2017/9/15.
 */
@javax.servlet.annotation.WebFilter(filterName = "UserFilter")
public class UserFilter implements javax.servlet.Filter {
    private String ip;
    public void destroy() {
    }

    public void doFilter(javax.servlet.ServletRequest req, javax.servlet.ServletResponse resp, javax.servlet.FilterChain chain) throws javax.servlet.ServletException, IOException {
        HttpServletRequest request= (HttpServletRequest) req;
        if (request.getRemoteAddr().equals(ip))
            request.getRequestDispatcher("black.jsp").forward(request,resp);
         else
             request.getRequestDispatcher("index.jsp").forward(request,resp);
        chain.doFilter(req, resp);
    }

    public void init(javax.servlet.FilterConfig config) throws javax.servlet.ServletException {
            ip=config.getInitParameter("ip");
    }

}
