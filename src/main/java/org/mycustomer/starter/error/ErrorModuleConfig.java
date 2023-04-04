package org.mycustomer.starter.error;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.mycustomer.starter.error.handler.RestExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Slf4j
@Configuration
@Import(RestExceptionHandler.class)
@ComponentScan
public class ErrorModuleConfig {

    @PostConstruct
    public void init(){
        log.info("Loading Error Module");
    }
}
