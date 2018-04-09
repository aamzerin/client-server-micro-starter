package io.aamzerin.micro.start.server.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import io.aamzerin.micro.start.server.domain.ServerData;

@FeignClient("server-micro-starter-service")
public interface ServerPublicService {

	@PostMapping("/getDataByContent")
	public List<ServerData> getDataByContent(@RequestBody String content); 
	
	@GetMapping("/getDataList")
	public List<ServerData> getDataList(); 
}
