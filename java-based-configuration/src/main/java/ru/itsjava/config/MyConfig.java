package ru.itsjava.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import ru.itsjava.condition.ConditionalOnMac;
import ru.itsjava.property.NotebookProperty;
import ru.itsjava.service.*;

@Configuration
@EnableConfigurationProperties(NotebookProperty.class)
public class MyConfig {

    @Bean
    @ConditionalOnMissingBean(NotebookService.class) // если такого бина нет, то вызывай
    @ConditionalOnProperty(value = "notebook.is-mac", havingValue = "true")
    public NotebookService noteService(){
        return new NotebookServiceImpl();
    }

    @Bean
    @ConditionalOnMissingBean(NotebookService.class)
    @ConditionalOnProperty(value = "notebook.is-mac", havingValue = "false")
    public NotebookService notMacNotebookService(){
        return new NotebookServiceNotMacImpl();
    }

    @Bean
    @ConditionalOnBean(NotebookService.class)
    public ProgrammerService programmerService(NotebookService notebookService){
        return new ProgrammerServiceImpl(notebookService);

    }

}
