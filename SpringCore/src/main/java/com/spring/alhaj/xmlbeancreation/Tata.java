package com.spring.alhaj;

public class Tata implements Car{

    @Override
    public void carDrive() {
        System.out.println("Drive Tata");
    }

    @Override
    public void fuel() {
        System.out.println("Fuel Tata");
    }
}
