package com.kafka.kafka.producer.resource;

import com.kafka.kafka.producer.model.User;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class userresource {

    @Autowired
    KafkaTemplate<String, User> kafkaTemplate;
    private static final  String TOPIC = "Kafka_Example_2";

    @GetMapping("/publish/{name}")
    public  String post(@PathVariable("name") final String name) {

        kafkaTemplate.send(TOPIC, new User(name,"Technology", 12000L));

        return  "Published successfully";
    }

}
