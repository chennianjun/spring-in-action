package com.learn.spring.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;
import org.thymeleaf.templateresolver.TemplateResolver;

/**
 * Created by Subtimental on 2017/4/20.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.learn.spring")
public class WebConfig extends WebMvcConfigurerAdapter {

//    @Bean
//    public InternalResourceViewResolver internalResourceViewResolver(){
//        return new InternalResourceViewResolver("/WEB-INF/views/",".jsp");
//    }

    @Bean
    public ViewResolver viewResolver(@Qualifier("templateEngine") SpringTemplateEngine templateEngine){
        ThymeleafViewResolver viewResolver=new ThymeleafViewResolver();
        viewResolver.setTemplateEngine(templateEngine);
        viewResolver.setCharacterEncoding("UTF-8");
        return viewResolver;
    }
    @Bean(name = "templateEngine")
    public SpringTemplateEngine templateEngine(@Qualifier("templateResolver") TemplateResolver templateResolver){
        SpringTemplateEngine templateEngine=new SpringTemplateEngine();
        templateEngine.setTemplateResolver(templateResolver);
        return templateEngine;
    }

    @Bean(name = "templateResolver")
    public TemplateResolver templateResolver(){
        TemplateResolver templateResolver=new ServletContextTemplateResolver();
        templateResolver.setPrefix("/WEB-INF/templates/");
        templateResolver.setSuffix(".html");
        templateResolver.setCharacterEncoding("UTF-8");
        templateResolver.setTemplateMode("HTML5");
        return templateResolver;
    }
//    @Bean
//    public MessageSource messageSource(){
//        ResourceBundleMessageSource messageSource=new ResourceBundleMessageSource();
//        messageSource.setBasename("messages");
//        return messageSource;
//    }
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}
