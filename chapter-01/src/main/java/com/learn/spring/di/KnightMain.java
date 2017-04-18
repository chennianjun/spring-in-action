package com.learn.spring.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Subtimental on 2017/4/18.
 */
public class KnightMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring-bean.xml");
//        context.getBean("knight");
//        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(KnightConfig.class);
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }
}
