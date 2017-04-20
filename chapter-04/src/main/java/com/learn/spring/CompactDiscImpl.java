package com.learn.spring;

import org.springframework.stereotype.Component;

/**
 * Created by Subtimental on 2017/4/20.
 */
//@Component
public class CompactDiscImpl implements CompactDisc {
    @Override
    public void play() {
        System.out.println("CompactDiscImpl.play");
    }

    @Override
    public int playTrack(int trackNum) {
        int result=trackNum+10;
        return result;
    }
}
