package io.aamzerin.micro.start.server.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import io.aamzerin.micro.start.server.domain.GetDataItemRequest;
import io.aamzerin.micro.start.server.domain.ServerData;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@FeignClient("server-micro-starter-service")
public interface ServerPublicService {

	@PostMapping("/getDataItem")
	public Mono<ServerData> getDataItem(@RequestBody GetDataItemRequest request); 
	
	@GetMapping("/getDataList")
	public Flux<ServerData> getDataList(); 
}
