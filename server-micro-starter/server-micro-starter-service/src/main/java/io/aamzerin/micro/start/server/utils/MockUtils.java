package io.aamzerin.micro.start.server.utils;

import java.util.List;

import io.aamzerin.micro.start.server.domain.ServerData;
import reactor.core.publisher.Flux;

public class MockUtils {

	public static List<ServerData> getData(){
				
		return Flux.just(new ServerData(1,"Text Data"), new ServerData(2,"Binary Data")).collectList().block();
		
	}
}
