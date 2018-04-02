package io.aamzerin.micro.start.server.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import io.aamzerin.micro.start.server.domain.ServerData;
import reactor.core.publisher.Flux;

@Repository
public interface DataRepository extends ReactiveCrudRepository<ServerData, String>{

	Flux<ServerData> findByContent(String content);
}
