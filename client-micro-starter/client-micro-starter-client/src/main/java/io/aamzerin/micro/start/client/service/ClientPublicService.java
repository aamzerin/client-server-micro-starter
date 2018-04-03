package io.aamzerin.micro.start.client.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import io.aamzerin.micro.start.client.domain.ClientData;
import io.aamzerin.micro.start.client.domain.GetDataItemFromServerRequest;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@FeignClient("server-micro-starter-service")
public interface ClientPublicService {

	@PostMapping("/getByContent")
	public Mono<ClientData> getDataItemFromServer(@RequestBody GetDataItemFromServerRequest request);
	
	@GetMapping("/getAll")
	public Flux<ClientData> getDataFromServer();

}
