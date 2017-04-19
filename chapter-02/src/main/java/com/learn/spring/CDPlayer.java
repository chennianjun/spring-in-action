package com.learn.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Subtimental on 2017/4/19.
 */
@Component
public class CDPlayer implements MediaPlayer{
    private CompactDisc disc;

//    @Autowired
    public CDPlayer(CompactDisc disc) {
        this.disc = disc;
    }

    @Override
    public void play() {
        disc.play();
    }
}
