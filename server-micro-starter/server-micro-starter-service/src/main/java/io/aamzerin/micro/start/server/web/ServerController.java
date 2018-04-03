package io.aamzerin.micro.start.server.web;

import org.springframework.web.bind.annotation.RestController;

import io.aamzerin.micro.start.server.domain.GetDataItemRequest;
import io.aamzerin.micro.start.server.domain.ServerData;
import io.aamzerin.micro.start.server.service.ServerPublicService;
import io.aamzerin.micro.start.server.utils.MockUtils;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class ServerController implements ServerPublicService{

	@Override
	public Mono<ServerData> getDataItem(GetDataItemRequest request) {
		
		return MockUtils.getData().filter(sd -> sd.getContent().contains(request.getContent())).single();
	}

	@Override
	public Flux<ServerData> getDataList() {
		// TODO Auto-generated method stub
		return MockUtils.getData();
	}

}
