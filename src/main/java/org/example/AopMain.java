package org.example;

import org.example.service.FactoryService;
import org.example.service.ShapeService;

public class AopMain {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        ShapeService shapeService = context.getBean("shapeService", ShapeService.class);

        FactoryService factoryService = new FactoryService();
        ShapeService shapeService = (ShapeService) factoryService.getBean("shapeService");
        shapeService.getCircle();
//        System.out.println(shapeService.getCircle());
    }
}