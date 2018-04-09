package io.aamzerin.micro.start.client.mapper;

import java.util.ArrayList;
import java.util.List;

import io.aamzerin.micro.start.client.domain.ClientData;
import io.aamzerin.micro.start.server.domain.ServerData;

public class DataMapper {
	
	public static List<ClientData> toClientDataList(List<ServerData> list){
		
		List<ClientData> returnList = new ArrayList<>();
		list.forEach(sd -> returnList.add(new ClientData(sd.getId(),sd.getContent())));
		return returnList;
	}

}
