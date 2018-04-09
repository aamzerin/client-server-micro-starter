package io.aamzerin.micro.start.client.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import io.aamzerin.micro.start.client.domain.ClientData;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@FeignClient("server-micro-starter-service")
public interface ClientPublicService {

	@PostMapping("/getByContent")
	public Mono<List<ClientData>> getDataItemFromServer(@RequestBody String content);
	
	@GetMapping("/getAll")
	public Flux<ClientData> getDataFromServer();

}
