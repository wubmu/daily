package filter;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;


public class CountFilter implements javax.servlet.Filter {
    private int count;

    public void destroy() {
    }

    public void doFilter(javax.servlet.ServletRequest req, javax.servlet.ServletResponse resp, javax.servlet.FilterChain chain) throws javax.servlet.ServletException, IOException {
        count++;
        System.out.println("count = " + count);
        HttpServletRequest request = (HttpServletRequest) req;
        request.getSession().setAttribute("count", count);
        chain.doFilter(req, resp);
    }

    public void init(javax.servlet.FilterConfig config) throws javax.servlet.ServletException {
        count = Integer.parseInt(config.getInitParameter("count"));
        System.out.println(count);
    }

}
