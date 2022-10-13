package org.example.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {


    @Pointcut("execution(* get*())")
    public void allGetters(){};

    @Before("allGetters()")
    public void loggingAdvice(){
        System.out.println("Advice run. Get Method Called");
    }

    @Before("allGetters()")
    public void secondLoggingAdvice(){
        System.out.println("Second Advice executed");
    }


}
