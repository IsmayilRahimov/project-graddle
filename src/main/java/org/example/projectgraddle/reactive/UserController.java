package org.example.projectgraddle.reactive;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;


@RestController
public class UserController {
    UserService userService;

    @GetMapping("/user")
    public Mono<User> getUser(@RequestParam int id) {
        return userService.getUser(id);
    }


}
