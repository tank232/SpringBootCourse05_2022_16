package ru.otus.spring.integration.integration;


import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;
import ru.otus.spring.integration.domain.Insect;

@MessagingGateway
public interface I {

    @Gateway(requestChannel = "insectFlow.input")
    void process(Insect insect);
}
