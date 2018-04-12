package io.aamzerin.micro.start.client.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import io.aamzerin.micro.start.client.domain.ClientData;
import io.aamzerin.micro.start.client.mapper.DataMapper;
import io.aamzerin.micro.start.client.service.ClientPublicService;
import io.aamzerin.micro.start.server.service.ServerPublicService;

@RestController
public class ClientController implements ClientPublicService{

	@Autowired
	ServerPublicService serverPublicService;
	
	@Override
	public List<ClientData> getDataItemFromServer(String request) {

		return DataMapper.toClientDataList(serverPublicService.getDataByContent(request));
	}

	@Override
	public List<ClientData> getDataFromServer() {

		return DataMapper.toClientDataList(serverPublicService.getDataList());
	}

}
