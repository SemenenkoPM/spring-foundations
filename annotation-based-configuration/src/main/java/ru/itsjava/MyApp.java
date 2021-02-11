package ru.itsjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import ru.itsjava.service.ProgrammerService;

@ComponentScan
public class MyApp {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(MyApp.class) {
        };
        context.getBean(ProgrammerService.class).printItems();
    }
}
