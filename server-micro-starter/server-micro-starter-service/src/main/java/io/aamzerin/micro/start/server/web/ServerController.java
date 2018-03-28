package io.aamzerin.micro.start.server.web;

import io.aamzerin.micro.start.server.domain.Data;
import io.aamzerin.micro.start.server.domain.GetDataItemRequest;
import io.aamzerin.micro.start.server.service.ServerPublicService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class ServerController implements ServerPublicService{

	@Override
	public Mono<Data> getDataItem(GetDataItemRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flux<Data> getDataList() {
		// TODO Auto-generated method stub
		return null;
	}

}
