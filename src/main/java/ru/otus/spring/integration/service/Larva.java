package ru.otus.spring.integration.service;

import org.springframework.stereotype.Service;
import ru.otus.spring.integration.domain.Insect;

@Service
public class Larva {

    public Insect process(Insect insect) {
        System.out.println("Larva is processing insect: " + insect.getName());
        return insect;
    }
}
