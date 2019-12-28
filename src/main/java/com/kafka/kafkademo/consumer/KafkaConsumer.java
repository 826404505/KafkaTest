package com.kafka.kafkademo.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author zhaosq
 * @description
 * @date 2019/12/28 11:34
 */
@Component
public class KafkaConsumer {

    @KafkaListener(topics = {"test"}, containerFactory = "kafkaListenerContainerFactory")
    public void listen(String message) {
        System.out.println("=========== " + message + " =============");
    }

    @KafkaListener(topics = {"test2"}, containerFactory = "kafkaListenerContainerFactoryTwo")
    public void listenSecond(String message) {
        System.out.println("=========== " + message + " =============");
    }


}
