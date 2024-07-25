package com.example.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SampleApplication {

	public static void main(String[] args) {


		var ctx = SpringApplication.run(SampleApplication.class, args);

		//initial instance object
		MyFirst myFirst = ctx.getBean("myFirstBean", MyFirst.class);
		System.out.println(myFirst.sayHello());


	}





}
