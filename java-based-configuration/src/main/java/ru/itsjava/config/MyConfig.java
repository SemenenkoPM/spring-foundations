package ru.itsjava.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import ru.itsjava.condition.ConditionalOnMac;
import ru.itsjava.service.*;

@Configuration
public class MyConfig {

    @Bean
    @ConditionalOnMissingBean(NotebookService.class) // если такого бина нет, то вызывай
    @ConditionalOnMac
    public NotebookService noteService(){
        return new NotebookServiceImpl();
    }

    @Bean
    @ConditionalOnMissingBean(NotebookService.class)
    public NotebookService notMacNotebookService(){
        return new NotebookServiceNotMacImpl();
    }

    @Bean
    @ConditionalOnBean(NotebookService.class)
    public ProgrammerService programmerService(NotebookService notebookService){
        return new ProgrammerServiceImpl(notebookService);

    }

}
