package ru.otus.spring.integration.service;

import org.springframework.stereotype.Service;
import ru.otus.spring.integration.domain.Insect;

@Service
public class Butterfly {

    public Insect process(Insect insect) {
        System.out.println("Butterfly is processing insect: " + insect.getName());
        return insect;
    }
}
