package io.aamzerin.micro.start.server.utils;

import java.util.ArrayList;
import java.util.List;

import io.aamzerin.micro.start.server.domain.ServerData;

public class MockUtils {

	public static List<ServerData> getData(){
		
		ArrayList<ServerData> list = new ArrayList<>();
		list.add(new ServerData("1","Text Data"));
		list.add(new ServerData("2","Binary Data"));
		
		return list;
	}
}
