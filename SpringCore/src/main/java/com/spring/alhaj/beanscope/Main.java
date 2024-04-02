package com.spring.alhaj.componentscan;

import com.spring.alhaj.xmlbeancreation.BMW;
import com.spring.alhaj.xmlbeancreation.Tata;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String args[]){



        ApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MyBean myBean = configApplicationContext.getBean(MyBean.class);
        System.out.println(myBean.getValue());


    }
}
