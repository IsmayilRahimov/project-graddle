package org.example.projectgraddle.reactive;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

public interface UserService {
    Mono<User> getUser(int id);
}
