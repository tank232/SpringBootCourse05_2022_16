package ru.otus.spring.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.otus.spring.integration.service.InsectService;

@SpringBootApplication
public class App {

    public static void main( String[] args ) throws Exception {
        ConfigurableApplicationContext ctx = SpringApplication.run(App.class, args);

        InsectService insectService = ctx.getBean(InsectService.class);
        insectService.startInsect();

    }

}
