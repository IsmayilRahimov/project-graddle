package org.example.projectgraddle.reactive;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class UserServiceImp implements UserService {
    private final WebClient userWebClient;

    public UserServiceImp(WebClient userWebClient) {
        this.userWebClient = userWebClient;
    }

    public Mono<User> getUser(int id) {
        return userWebClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("get/user")
                        .queryParam("userId", id)
                        .build()
                )
                .retrieve()
                .bodyToMono(User.class);
    }
}
