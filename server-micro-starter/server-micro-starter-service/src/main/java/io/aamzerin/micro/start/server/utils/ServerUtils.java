package io.aamzerin.micro.start.server.utils;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import io.aamzerin.micro.start.server.domain.ServerData;
import io.aamzerin.micro.start.server.domain.repository.DataRepository;
import reactor.core.publisher.Flux;

@Service
public class ServerUtils {

	@Bean
	ApplicationRunner demoData(DataRepository dataRepository){
		return args -> {
			dataRepository.deleteAll()
					.thenMany(Flux.just("Text Data", "Binary Data").map(content -> new ServerData(null, content))
							.flatMap(dataRepository::save))
					.thenMany(dataRepository.findAll()).subscribe(System.out::println);
		};
	}
}
