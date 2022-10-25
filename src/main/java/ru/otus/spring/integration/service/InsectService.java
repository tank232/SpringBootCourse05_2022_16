package ru.otus.spring.integration.service;

import lombok.RequiredArgsConstructor;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.stereotype.Service;
import ru.otus.spring.integration.domain.Insect;
import ru.otus.spring.integration.integration.I;

@Service
@RequiredArgsConstructor
public class InsectService {


    private final DirectChannel outputChannel;
    private final I i;
    public void startInsect()
    {
        // обработчик внутри subscribe выполнится как только закончится выполнение flow
        outputChannel.subscribe(System.out::println);
        // запускаем выполнение flow
        i.process(new Insect("cabbage butterfly"));
        // можно было запустить flow отправкой сообщения во входной канал input:
        // MessageChannel inputChannel = ctx.getBean("animalFlow.input", MessageChannel.class);
        // inputChannel.send(MessageBuilder.withPayload(new Animal("cat")).build());
    }
}
