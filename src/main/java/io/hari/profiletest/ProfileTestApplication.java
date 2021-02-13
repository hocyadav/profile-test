package io.hari.profiletest;

import javax.annotation.PostConstruct;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class ProfileTestApplication implements CommandLineRunner{
    public static void main(String[] args) {
        SpringApplication.run(ProfileTestApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.err.println("main class : ProfileTestApplication.run");
    }
}

@Component
@Order(1)
class Class1 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.err.println("Order 1 : Class1.run");
    }
}

@Component
@Order(2)
class Class2 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.err.println("Order 2 : Class2.run");
    }

    @PostConstruct
    public void foo() {
        System.err.println("PostConstruct Class2.foo");
        System.err.println("PostConstruct Class2.foo");
        System.err.println("PostConstruct Class2.foo");
    }
}

