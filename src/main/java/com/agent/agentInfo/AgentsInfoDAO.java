package com.agent.agentInfo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgentsInfoDAO {

	@Autowired
	private AgentsRepository agentsRepository;
	
	public Optional<Agents> agentData(String agentCode){
		Optional<Agents> agentData = agentsRepository.findById(agentCode);
		return agentData;
		
	}
}
