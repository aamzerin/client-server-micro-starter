package io.aamzerin.micro.start.client.service;

import org.springframework.web.bind.annotation.RequestBody;

import io.aamzerin.micro.start.client.domain.ClientData;
import io.aamzerin.micro.start.client.domain.GetDataItemFromServerRequest;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ClientPublicService {

	public Mono<ClientData> getDataItemFromServer(@RequestBody GetDataItemFromServerRequest request);
	
	public Flux<ClientData> getDataFromServer();

}
