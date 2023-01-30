package com.luxoft.training.spring.cloud;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface PublisherChannel {

    String CHANNEL_NAME = "words";

    @Output(CHANNEL_NAME)
    MessageChannel words();
}
