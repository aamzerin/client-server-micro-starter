package io.aamzerin.micro.start.server.web;

import io.aamzerin.micro.start.server.domain.GetDataItemRequest;
import io.aamzerin.micro.start.server.domain.ServerData;
import io.aamzerin.micro.start.server.service.ServerPublicService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class ServerController implements ServerPublicService{

	@Override
	public Mono<ServerData> getDataItem(GetDataItemRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flux<ServerData> getDataList() {
		// TODO Auto-generated method stub
		return null;
	}

}
