package ru.otus.spring.integration.service;

import org.springframework.stereotype.Service;
import ru.otus.spring.integration.domain.Insect;

@Service
public class Cocoon {

    public Insect process(Insect insect) {
        System.out.println("Cocoon is processing insect: " + insect.getName());
        return insect;
    }
}
