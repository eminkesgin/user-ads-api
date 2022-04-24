package com.medipol.useradsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.medipol.useradsapi.domain"})  // scan JPA entities

public class UserAdsApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserAdsApiApplication.class, args);
    }

}
