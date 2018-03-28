package io.aamzerin.micro.start.server.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import io.aamzerin.micro.start.server.domain.Data;
import io.aamzerin.micro.start.server.domain.GetDataItemRequest;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ServerPublicService {

	@PostMapping("/getDataItem")
	public Mono<Data> getDataItem(@RequestBody GetDataItemRequest request); 
	
	@GetMapping("/getDataList")
	public Flux<Data> getDataList(); 
}
