package ru.itsjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.itsjava.service.ProgrammerService;

public class MyApp {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        // когда мы вызываем контекст что происходит?
        context.getBean(ProgrammerService.class).printItems();
    }
}
