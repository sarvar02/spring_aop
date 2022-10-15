package org.example.service;

import org.example.aspects.LoggingAspect;
import org.example.model.Circle;

public class ShapeServiceProxy extends ShapeService{

    @Override
    public Circle getCircle(){
        new LoggingAspect().loggingAdvice();
        return super.getCircle();
    }
}
