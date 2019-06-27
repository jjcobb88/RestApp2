package com.johnsprogram.restservice.RestApp;

import com.what3words.javawrapper.response.ConvertToCoordinates;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author John Jacob <johnjacob88@hotmail.co.uk>
 * @version 1.1
 */

@SpringBootApplication
public class RestApplication {

    private static final Logger log = LoggerFactory.getLogger(RestApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(RestApplication.class, args);
    }

    @Bean
    public CommandLineRunner run() {
        return args -> {
            RestService restService = new RestService();
            ConvertToCoordinates first = restService.restCall("silk.slap.soils");
            log.info(first.toString());
            ConvertToCoordinates second = restService.restCall("zealous.range.garage");
            log.info(second.toString());
            ConvertToCoordinates third = restService.restCall("slurs.this.shark");
            log.info(third.toString());
        };
    }
}

