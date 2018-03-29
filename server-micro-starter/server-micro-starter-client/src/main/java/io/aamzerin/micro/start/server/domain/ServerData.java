package io.aamzerin.micro.start.server.domain;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class ServerData {

	@Id
	private UUID id;
	private String content;

}
