package io.aamzerin.micro.start.server.domain;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ServerData {

	@Id
	@JsonProperty("id")
	private String id;
	
	@JsonProperty("content")
	private String content;
	
	public ServerData() {
	}

	public ServerData(String id, String content) {
		super();
		this.id = id;
		this.content = content;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}
