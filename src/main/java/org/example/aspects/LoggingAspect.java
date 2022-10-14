package org.example.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
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

    @AfterReturning(pointcut = "args(name)", returning = "returnString")
    public void stringArgumentMethods(String name, String returnString){
        System.out.println("A method that takes String arguments has been called. The value is " + name);
        System.out.println("The returned value is " + returnString);
    }

    @AfterThrowing(pointcut = "args(name)", throwing = "ex")
    public void exceptionAdvice(String name, RuntimeException ex){
        System.out.println("An exception has been thrown: " + ex);
    }

    @Before("allCircleMethods()")
    public void loggingAdvice(JoinPoint joinPoint){
        // getTarget() returns the current object
        // Circle circle = (Circle) joinPoint.getTarget();

    }


}
