package io.aamzerin.micro.start.server.utils;

import java.util.UUID;

import io.aamzerin.micro.start.server.domain.ServerData;
import reactor.core.publisher.Flux;

public class MockUtils {

	public static Flux<ServerData> getData(){
				
		return Flux.just(new ServerData(UUID.randomUUID(),"Text Data"), new ServerData(UUID.randomUUID(),"Binary Data"));
		
	}
}
