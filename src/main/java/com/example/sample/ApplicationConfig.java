package com.example.sample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ApplicationConfig {

    @Bean
    MyFirst myFirstBean(){
        return new MyFirst("First Bean");
    }



}
