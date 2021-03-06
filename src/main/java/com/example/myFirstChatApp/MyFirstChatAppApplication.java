package com.example.myFirstChatApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class})
public class MyFirstChatAppApplication  {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstChatAppApplication.class, args);
	}

}
