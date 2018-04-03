package io.aamzerin.micro.start.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@EnableDiscoveryClient
@EnableFeignClients("io.aamzerin.micro.**.service")
@SpringBootApplication
//@SpringBootApplication(exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
//@EnableReactiveMongoRepositories
//@AutoConfigureAfter(EmbeddedMongoAutoConfiguration.class)
public class ServerApp {

	public static void main(String[] args) {
		SpringApplication.run(ServerApp.class, args);
	}

}