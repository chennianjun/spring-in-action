package com.learn.spring;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by Subtimental on 2017/4/19.
 */
public class CDPlayerTest {
    @Test
    public void play() throws Exception {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(CDPlayerConfig.class);
        MediaPlayer bean = context.getBean(MediaPlayer.class);
        bean.play();
    }

}