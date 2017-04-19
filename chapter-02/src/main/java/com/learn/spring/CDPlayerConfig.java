package com.learn.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Subtimental on 2017/4/19.
 */
@Configuration
//@ComponentScan
public class CDPlayerConfig {

    @Bean
    public CompactDisc compactDisc(){
        return new SgtPeppers();
    }

    @Bean
    public MediaPlayer mediaPlayer(){
        return new CDPlayer(compactDisc());
    }
}
