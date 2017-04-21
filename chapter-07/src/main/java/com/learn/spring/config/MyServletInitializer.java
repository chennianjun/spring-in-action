package com.learn.spring.config;

import com.learn.spring.servlet.MyServlet;
import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by Subtimental on 2017/4/21.
 */
public class MyServletInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        ServletRegistration.Dynamic mySesrvlet = servletContext.addServlet("myServlet", MyServlet.class);
        mySesrvlet.addMapping("/custom/**");
    }
}
