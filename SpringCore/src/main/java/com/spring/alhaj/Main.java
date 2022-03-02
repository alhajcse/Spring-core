package com.spring.alhaj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String args[]){

        System.out.println("Hello world");

        ApplicationContext context= new ClassPathXmlApplicationContext("classpath:beans.xml");

       BMW bmw= context.getBean("bmw",BMW.class);

       bmw.carDrive();
        /*Car car=new Toyota();
        car.carDrive();
        car.fuel();*/

    }
}
