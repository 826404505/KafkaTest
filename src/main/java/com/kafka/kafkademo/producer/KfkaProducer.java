package com.kafka.kafkademo.producer;

import java.util.Date;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


/**
 * @author zhaosq
 * @description
 * @date 2019/12/28 11:23
 */
@Component
public class KfkaProducer {

    private static Logger logger = LoggerFactory.getLogger(KfkaProducer.class);

    @Autowired
    private KafkaTemplate kafkaTemplate;

    public void sendMessage(String message) {
        kafkaTemplate.send("test", message);
    }

    public void sendMessageSecond(String message) {
        kafkaTemplate.send("test2", message);
    }

}
