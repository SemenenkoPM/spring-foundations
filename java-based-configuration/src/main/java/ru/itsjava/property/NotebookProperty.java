package ru.itsjava.property;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("notebook")
public class NotebookProperty {
    private boolean isMac = true;
}