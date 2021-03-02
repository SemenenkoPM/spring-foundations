package ru.itsjava.condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// В аннотации Conditional мы должны указать тот кондишион который будет обрабатывать эту аннотацию
@Conditional(OnMacCondition.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface ConditionalOnMac {
}
