package io.aamzerin.micro.start.client.web;

import io.aamzerin.micro.start.client.domain.ClientData;
import io.aamzerin.micro.start.client.domain.GetDataItemFromServerRequest;
import io.aamzerin.micro.start.client.service.ClientPublicService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class ClientController implements ClientPublicService{

	@Override
	public Mono<ClientData> getDataItemFromServer(GetDataItemFromServerRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flux<ClientData> getDataFromServer() {
		// TODO Auto-generated method stub
		return null;
	}

}
