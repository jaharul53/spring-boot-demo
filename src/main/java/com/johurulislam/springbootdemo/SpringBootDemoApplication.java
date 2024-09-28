package com.johurulislam.springbootdemo;

import com.johurulislam.springbootdemo.model.Computer;
import com.johurulislam.springbootdemo.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootDemoApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext=SpringApplication.run(SpringBootDemoApplication.class, args);
       // Computer computer = new Computer("Mac","air",12,1000,3.5f);
        Computer computer= (Computer) applicationContext.getBean("hpProBook");
       User user=new User("Johurul","Dhaka",computer);
        System.out.println(user);
    }

}
