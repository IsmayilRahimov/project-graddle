package org.example.projectgraddle.reactive;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class AsychronousJava {

    Mono<String> name = Mono.just("Ragimov");
    Mono<Integer> age = Mono.just(25);
    Mono<String> fullName = name.zipWith(age, (n, a) -> n + " " + a);


    Flux<String> names = Flux.just("Ragimov", "Vasiliev", "Petrov");
    Flux<Integer> ages = Flux.just(25, 26, 27);
    Flux<String> fullNames = names.zipWith(ages, (n, a) -> n + " " + a);
}
