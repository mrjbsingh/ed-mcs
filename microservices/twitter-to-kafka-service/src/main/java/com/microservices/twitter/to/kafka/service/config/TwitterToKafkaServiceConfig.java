package com.microservices.twitter.to.kafka.service.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Data   //boiler code for getter setter using lombok during compile time
@Configuration
@ConfigurationProperties (prefix = "twitter-to-kafka-service:")
public class TwitterToKafkaServiceConfig {
    private List<String> twitterKeywords;
}
