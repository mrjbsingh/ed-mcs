package com.microservices.twitter.to.kafka.service;

import com.microservices.twitter.to.kafka.service.config.TwitterToKafkaServiceConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class TwitterToKafkaServiceApplication implements CommandLineRunner {

    private static final Logger LOG = LoggerFactory.getLogger(TwitterToKafkaServiceApplication.class);
    private final TwitterToKafkaServiceConfig twitterToKafkaServiceConfig;

    public TwitterToKafkaServiceApplication(TwitterToKafkaServiceConfig configData) {
        this.twitterToKafkaServiceConfig = configData;
    }

    public static void main(String[] args) {
        SpringApplication.run(TwitterToKafkaServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        LOG.info("App starts ...");
        LOG.info(Arrays.toString(twitterToKafkaServiceConfig.getTwitterKeywords().toArray(new String[0])));
    }
}
