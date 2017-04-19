package com.learn.spring;

import org.springframework.stereotype.Component;

/**
 * Created by Subtimental on 2017/4/19.
 */
@Component
public class SgtPeppers implements CompactDisc {
    private String title="Club Band";
    private String artist="The Beatles";
    @Override
    public void play() {
        System.out.println("playing " + title+" by "+artist);
    }
}
