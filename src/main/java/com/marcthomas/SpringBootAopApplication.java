package com.marcthomas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootAopApplication  implements CommandLineRunner {
    @Autowired
    private MyService myService;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAopApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("Demonstration of @Before being called before the doSomething method");
        System.out.println(myService.doSomething());

        System.out.println();

        System.out.println("Demonstrate whether the @Before is called when calling doSomething from within the class");
        System.out.println(myService.callDoSomethingInternally());
    }
}
