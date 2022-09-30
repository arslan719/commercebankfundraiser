package com.commerce.commercebankfundraiser.model;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepo repository){
        return args -> {
            User Peter = new User(
                    "Peter",
                    "peter@hotmail.com",
                    "First User"
            );
            repository.saveAll(
                    List.of(Peter)
            );
        };
    }
}
