package io.aamzerin.micro.start.client.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import io.aamzerin.micro.start.client.domain.ClientData;
import io.aamzerin.micro.start.client.domain.GetDataItemFromServerRequest;
import io.aamzerin.micro.start.client.service.ClientPublicService;
import io.aamzerin.micro.start.server.service.ServerPublicService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class ClientController implements ClientPublicService{

	@Autowired
	ServerPublicService serverPublicService;
	
	@Override
	public Mono<ClientData> getDataItemFromServer(GetDataItemFromServerRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flux<ClientData> getDataFromServer() {
		
		Flux<ClientData> response = null;
		serverPublicService.getDataList().subscribe(sd -> response.just(new ClientData(sd.getId(),sd.getContent())));
		return response;
	}

}
