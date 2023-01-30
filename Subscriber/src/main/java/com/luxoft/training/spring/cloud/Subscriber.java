package com.luxoft.training.spring.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@SpringBootApplication
@EnableBinding(SubscriberChannel.class)
@RestController
public class Subscriber {

    private Map<String, AtomicInteger> wordMap = new ConcurrentHashMap<>();

    @GetMapping
    public Map<String, AtomicInteger> getWords() {
        return wordMap;
    }

    @StreamListener(SubscriberChannel.CHANNEL_NAME)
    public void countWords(String word) {
        if (wordMap.containsKey(word))
            wordMap.get(word).incrementAndGet();
        else
            wordMap.put(word,new AtomicInteger(1));
    }

    public static void main(String[] args) {
        SpringApplication.run(Subscriber.class, args);
    }
}
