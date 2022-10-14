package org.example.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.example.model.Circle;

@Aspect
public class LoggingAspect {


    @Pointcut("execution(* get*())")
    public void allGetters(){};

    @Pointcut("within(org.example.model.Circle)")
    public void allCircleMethods(){};


//    @Before("args(String)")
//    public void stringArgumentMethods(){
//        System.out.println("A method that takes String arguments has been called");
//    }

    @Before("args(name)")
    public void stringArgumentMethods(String name){
        System.out.println("A method that takes String arguments has been called. The value is " + name);
    }

    @Before("allCircleMethods()")
    public void loggingAdvice(JoinPoint joinPoint){
        // getTarget() returns the current object
        // Circle circle = (Circle) joinPoint.getTarget();

    }


}
