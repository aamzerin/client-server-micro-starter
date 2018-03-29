package io.aamzerin.micro.start.server.domain.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import io.aamzerin.micro.start.server.domain.ServerData;
import reactor.core.publisher.Flux;

public interface DataRepository extends ReactiveCrudRepository<ServerData, String>{

	Flux<ServerData> findByContent(String content);
}
