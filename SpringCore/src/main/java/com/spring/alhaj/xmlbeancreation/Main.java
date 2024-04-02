package com.spring.alhaj;

import com.spring.alhaj.componentscan.AppConfig;
import com.spring.alhaj.componentscan.MyBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String args[]){

        System.out.println("Hello world");
        ApplicationContext context= new ClassPathXmlApplicationContext("classpath:beans.xml");
        BMW bmw= context.getBean("bmw",BMW.class);
        bmw.carDrive();
        Tata tata= context.getBean("tata",Tata.class);
        tata.carDrive();

        ApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MyBean myBean = configApplicationContext.getBean(MyBean.class);
        System.out.println(myBean.getValue());
        /*Car car=new Toyota();
        car.carDrive();
        car.fuel();*/

    }
}
