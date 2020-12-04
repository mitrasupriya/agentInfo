package com.agent.agentInfo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgentsRepository extends CrudRepository<Agents, String> {

}
