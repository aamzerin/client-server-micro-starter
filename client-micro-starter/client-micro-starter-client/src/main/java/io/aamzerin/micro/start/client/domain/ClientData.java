package io.aamzerin.micro.start.client.domain;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ClientData {

	private UUID id;
	private String content;

}

