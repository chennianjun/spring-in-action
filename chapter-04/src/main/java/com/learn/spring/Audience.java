package com.learn.spring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by Subtimental on 2017/4/20.
 */
@Aspect
public class Audience {
    @Pointcut("execution(* com.learn.spring.Player.play(..))")
    public void performance(){}

    @Pointcut("execution()")
    public void cd(){}

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint joinPoint){
        try{
            System.out.println("start performance");
            joinPoint.proceed();
            System.out.println("end performance");
        } catch (Throwable throwable) {
            System.out.println("performance fail");
        }
    }
}
