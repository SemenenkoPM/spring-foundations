package ru.itsjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import ru.itsjava.service.ProgrammerService;
@SpringBootApplication
public class MyApp {
    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(MyApp.class);
        context.getBean(ProgrammerService.class).printItems();
    }
}
