package com.learn.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Subtimental on 2017/4/20.
 */
@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class Config {

    @Bean
    public Audience audience(){
        return new Audience();
    }

    @Bean
    public TrackCounter trackCounter(){
        return new TrackCounter();
    }

}
