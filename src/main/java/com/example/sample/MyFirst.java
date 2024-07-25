package com.example.sample;

import org.springframework.stereotype.Component;



public class MyFirst {


    private String myVar;

    public MyFirst(String myVar) {
        this.myVar = myVar;
    }

    public String sayHello(){
        return "Hello from MyFirst class ==> "+ myVar;
    }
}
