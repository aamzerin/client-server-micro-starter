package io.aamzerin.micro.start.client.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClientData {

	@JsonProperty("id")
	private Integer id;
	
	@JsonProperty("content")
	private String content;

	public ClientData(){
		
	}
	
	public ClientData(Integer id, String content) {
		super();
		this.id = id;
		this.content = content;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	

}

