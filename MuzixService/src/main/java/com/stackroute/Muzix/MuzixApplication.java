package com.stackroute.Muzix;

import com.stackroute.Muzix.repository.TrackRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableEurekaClient
public class MuzixApplication {
    public static void main(String[] args) {
        SpringApplication.run(MuzixApplication.class, args);
    }
}
