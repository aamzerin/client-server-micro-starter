package io.aamzerin.micro.start.server.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.aamzerin.micro.start.server.domain.ServerData;

public interface DataRepository extends MongoRepository<ServerData, String>{

	List<ServerData> findByContent(String content);
}
