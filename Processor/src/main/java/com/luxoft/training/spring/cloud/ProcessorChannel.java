package com.luxoft.training.spring.cloud;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface ProcessorChannel {
    String CHANNEL_NAME_INPUT = "words";

    String CHANNEL_NAME_OUTPUT = "upperWords";

    @Input(CHANNEL_NAME_INPUT)
    SubscribableChannel words();

    @Output(CHANNEL_NAME_OUTPUT)
    MessageChannel upperWords();
}
