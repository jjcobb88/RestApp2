package com.johnsprogram.restservice.RestApp;

import com.what3words.javawrapper.response.ConvertToCoordinates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestService {

    private RestTemplate restTemplate;
    private final String apiKey = "VEXXXJRL";
    private final String coordinatesUrl = "https://api.what3words.com/v3/convert-to-coordinates?words=";

    @Autowired
    public RestService() {
        this.restTemplate = restTemplate();
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public ConvertToCoordinates restCall(String words) {
        return this.restTemplate.getForObject(coordinatesUrl + words + "&key=" + apiKey,
                ConvertToCoordinates.class);
    }
}
