package org.example.projectgraddle.asychronous;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface ReactiveUserService {
   Flux<List<ReactiveUser>> getUsersList();
   Mono<ReactiveUser> getUser();




}
