package com.learn.spring.aop;

import java.io.PrintStream;

/**
 * Created by Subtimental on 2017/4/18.
 */
public class Minstrel {

    private PrintStream stream;

    public Minstrel(PrintStream stream) {
        this.stream = stream;
    }

    public void singBeforeQuest(){
        System.out.println("Minstrel.singBeforeQuest");
    }

    public void singAfterQuest(){
        System.out.println("Minstrel.singAfterQuest");
    }
}
