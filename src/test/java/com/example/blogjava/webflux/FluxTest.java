package com.example.blogjava.webflux;

import java.time.Duration;

import org.junit.jupiter.api.Test;

import reactor.core.publisher.Flux;

class FluxTest {
    @Test
    void fluxTest() {
        Flux.interval(Duration.ofMillis(100)).take(10).doOnNext(System.out::println).log().subscribe();
    }
}
