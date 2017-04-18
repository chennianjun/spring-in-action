package com.learn.spring.config;

import com.learn.spring.di.BraveKnight;
import com.learn.spring.di.Knight;
import com.learn.spring.di.Quest;
import com.learn.spring.di.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Subtimental on 2017/4/18.
 */
@Configuration
public class KnightConfig {

    @Bean
    public Knight knight(){
        System.out.println("KnightConfig.knight");
        return new BraveKnight(stream());
    }

    @Bean
    public Quest stream(){
        System.out.println("KnightConfig.stream");
        return new SlayDragonQuest(System.out);
    }
}
