package com.learn.spring;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Subtimental on 2017/4/20.
 */
@Aspect
public class TrackCounter {

    private Map<Integer,Integer> map=new HashMap<>();

    @Pointcut(value = "execution(* com.learn.spring.CompactDisc.playTrack(int))")
    public void count(){}

    @Before(value = "count() && args(trackNum)",argNames = "trackNum")
    public void countTrack(int trackNum){
        int counter = getTrackCounter(trackNum);
        map.put(trackNum,counter+1);
    }

    public int getTrackCounter(int trackNum){
        return map.containsKey(trackNum)?map.get(trackNum):0;
    }
}
