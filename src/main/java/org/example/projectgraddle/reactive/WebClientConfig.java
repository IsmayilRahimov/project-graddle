package org.example.projectgraddle.reactive;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {
    private final String userBaseUrl = "http://client.azericard.az";
    private final String countryBaseUrl = "http://country.az";

    @Bean
    public WebClient userWebClient() {
        return WebClient.builder()
                .baseUrl(userBaseUrl)
                .build();

    }

    @Bean
    public WebClient countryWebClient() {
        return WebClient.builder()
                .baseUrl(countryBaseUrl)
                .build();
    }

}
