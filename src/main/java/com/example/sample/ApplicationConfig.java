package com.example.sample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ApplicationConfig {

    @Bean
    @Qualifier("first")
    MyFirst myFirstBean(){
        return new MyFirst("First Bean");
    }

    @Bean
    @Qualifier("second")
    MyFirst mySecondBean(){
        return new MyFirst("Second Bean");
    }


}
