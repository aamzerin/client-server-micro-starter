package io.aamzerin.micro.start.server.web;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.RestController;

import io.aamzerin.micro.start.server.domain.ServerData;
import io.aamzerin.micro.start.server.service.ServerPublicService;
import io.aamzerin.micro.start.server.utils.MockUtils;

@RestController
public class ServerController implements ServerPublicService{

	@Override
	public List<ServerData> getDataByContent(String content) {
		
		return MockUtils.getData().stream().filter(sd -> sd.getContent().contains(content)).collect(Collectors.toList());
	}

	@Override
	public List<ServerData> getDataList() {
		// TODO Auto-generated method stub
		return MockUtils.getData();
	}

}
