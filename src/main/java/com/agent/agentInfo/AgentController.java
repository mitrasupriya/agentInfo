package com.agent.agentInfo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgentController {
	@Autowired
	private AgentsInfoDAO agentsInfoDAO;
	
	@GetMapping("/agentCode/{agentCode}")
	public Optional<Agents> getAgentData(@PathVariable String agentCode){
		System.out.println(agentsInfoDAO.agentData(agentCode));
		return agentsInfoDAO.agentData(agentCode);
	}
}

