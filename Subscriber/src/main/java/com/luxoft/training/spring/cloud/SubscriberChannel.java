package com.luxoft.training.spring.cloud;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface SubscriberChannel {

    String CHANNEL_NAME = "upperWords";

    @Input(CHANNEL_NAME)
    SubscribableChannel upperWords();
}
