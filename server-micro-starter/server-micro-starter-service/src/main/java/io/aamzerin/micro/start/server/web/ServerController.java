package io.aamzerin.micro.start.server.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import io.aamzerin.micro.start.server.domain.ServerData;
import io.aamzerin.micro.start.server.repository.DataRepository;
import io.aamzerin.micro.start.server.service.ServerPublicService;

@RestController
public class ServerController implements ServerPublicService{
	
	@Autowired
	private DataRepository dataRepository;

	@Override
	public List<ServerData> getDataByContent(String content) {
		
		return dataRepository.findByContent(content);
	}

	@Override
	public List<ServerData> getDataList() {
		// TODO Auto-generated method stub
		return dataRepository.findAll();
	}

}
