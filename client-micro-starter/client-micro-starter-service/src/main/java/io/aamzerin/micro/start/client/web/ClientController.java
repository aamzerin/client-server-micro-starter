package io.aamzerin.micro.start.client.web;

import java.time.Duration;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import io.aamzerin.micro.start.client.domain.ClientData;
import io.aamzerin.micro.start.client.mapper.DataMapper;
import io.aamzerin.micro.start.client.service.ClientPublicService;
import io.aamzerin.micro.start.server.service.ServerPublicService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class ClientController implements ClientPublicService{

	@Autowired
	ServerPublicService serverPublicService;
	
	@Override
	public Mono<List<ClientData>> getDataItemFromServer(String request) {

		return Mono.just(DataMapper.toClientDataList(serverPublicService.getDataByContent(request)));
	}

	@Override
	public Flux<ClientData> getDataFromServer() {
		
		Flux<ClientData> response = Flux.fromIterable(DataMapper.toClientDataList(serverPublicService.getDataList()))
			    .delayElements(Duration.ofMillis(100));

		return response;
	}

}
