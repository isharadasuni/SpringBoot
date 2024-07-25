package com.example.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SampleApplication {

	public static void main(String[] args) {

		var ctx = SpringApplication.run(SampleApplication.class, args);

		//create instance object
		MyFirst myFirst = ctx.getBean(MyFirst.class);
		System.out.println(myFirst.sayHello());


	}

    @Bean
	public MyFirst myFirst() {
		return new MyFirst();
	}



}
