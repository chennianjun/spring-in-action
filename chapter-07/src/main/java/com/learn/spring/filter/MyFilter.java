package com.learn.spring.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by Subtimental on 2017/4/21.
 */
public class MyFilter implements Filter {
    public void destroy() {
        System.out.println("MyFilter.destroy");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("MyFilter.doFilter");
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
        System.out.println("MyFilter.init");
    }

}
