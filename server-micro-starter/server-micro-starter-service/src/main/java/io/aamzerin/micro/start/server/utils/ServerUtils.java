package io.aamzerin.micro.start.server.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

import io.aamzerin.micro.start.server.domain.ServerData;
import io.aamzerin.micro.start.server.repository.DataRepository;

@Configuration
public class ServerUtils implements ApplicationRunner{
	
	@Autowired
	DataRepository repository;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {

		repository.deleteAll();

		// save a couple of customers
		repository.save(new ServerData(null, "Text data"));
		repository.save(new ServerData(null, "Binary data"));

		// fetch all customers
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		
		repository.findAll().stream().forEach(sd -> System.out.println(sd));
		
		for (ServerData serverData : repository.findAll()) {
			System.out.println(serverData);
		}
		System.out.println();

		// fetch an individual customer
		System.out.println("Customer found with findByContent('Binary'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByContent("Binary data"));

		System.out.println("Customers found with findByContent('Text'):");
		System.out.println("--------------------------------");
		repository.findByContent("Text data").forEach(sd -> System.out.println(sd));

	}
}
