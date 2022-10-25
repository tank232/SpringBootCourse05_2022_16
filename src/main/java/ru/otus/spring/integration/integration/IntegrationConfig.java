package ru.otus.spring.integration.integration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.channel.PublishSubscribeChannel;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.MessageChannels;

@Configuration
public class IntegrationConfig {


    @Bean
    DirectChannel outputChannel() {
        return new DirectChannel();
    }

    @Bean
    public IntegrationFlow insectFlow() {
        return flow -> flow.handle("larva", "process")
                .handle("caterpillar", "process")
                .handle("cocoon", "process")
                .handle("butterfly", "process")
                .channel("outputChannel");
    }

}
