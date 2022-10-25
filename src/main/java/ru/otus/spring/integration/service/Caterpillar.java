package ru.otus.spring.integration.service;

import org.springframework.stereotype.Service;
import ru.otus.spring.integration.domain.Insect;

@Service
public class Caterpillar {

    public Insect process(Insect insect) {
        System.out.println("Caterpillar is processing insect: " + insect.getName());
        return insect;
    }
}
