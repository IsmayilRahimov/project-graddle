package org.example.projectgraddle.asychronous;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;
@Service
public class ReactiveUserUserServiceImpl implements ReactiveUserService {

    List<ReactiveUser> userlist = new ArrayList<>();
    ReactiveUser reactiveUser1 = new ReactiveUser(1, "Ali", "ali@gmail.com");
    ReactiveUser reactiveUser2 = new ReactiveUser(2, "Anar", "anar@gmail.com");
    ReactiveUser reactiveUser3 = new ReactiveUser(3, "Cavad", "cavad@gmail.com");


    @Override
    public Flux<List<ReactiveUser>> getUsersList() {
        userlist.add(reactiveUser1);
        userlist.add(reactiveUser2);
        userlist.add(reactiveUser3);


        return Flux.just(userlist);
    }

    @Override

    public Mono<ReactiveUser> getUser() {

        return Mono.just(reactiveUser1);
    }

}

