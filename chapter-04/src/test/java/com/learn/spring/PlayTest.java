//package com.learn.spring;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringRunner;
//
///**
// * Created by Subtimental on 2017/4/20.
// */
//public class PlayTest {
//
//    @Test
//    public void play() throws Exception {
//        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
//        CompactDisc disc = context.getBean(CompactDisc.class);
//        disc.playTrack(1);
//
////        ClassPathXmlApplicationContext context1=new ClassPathXmlApplicationContext("application.xml");
////        CompactDisc compactDisc = (CompactDisc) context1.getBean("compactDisc");
////        compactDisc.playTrack(1);
//    }
//
//}