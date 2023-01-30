package com.luxoft.training.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.SendTo;

@SpringBootApplication
@EnableBinding(ProcessorChannel.class)
public class Processor {

    public static void main(String[] args) {
        SpringApplication.run(Processor.class, args);
    }

    @StreamListener(ProcessorChannel.CHANNEL_NAME_INPUT)
    @SendTo(ProcessorChannel.CHANNEL_NAME_OUTPUT)
    public String process(String word) {
        return word.toUpperCase();
    }
}