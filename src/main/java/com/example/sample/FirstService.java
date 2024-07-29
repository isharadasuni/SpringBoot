package com.example.sample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class FirstService {

    //DI
    private final MyFirst myFirst;


    public FirstService(@Qualifier("second") MyFirst myFirst) {
        this.myFirst = myFirst;
    }

    public String tellStory(){
        return "The dependency is saying :" + myFirst.sayHello();
    }

}
