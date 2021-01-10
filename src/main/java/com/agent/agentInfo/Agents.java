package com.agent.agentInfo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AGENTS")
public class Agents {
	
	/*
	 * @Id
	 * 
	 * @Column(name="AGENT_CODE")
	 */
	@Id
	private String agent_Code;
	private String agent_Name;
	private String working_Area;
	private Double commission;
	private String phone_No;
	private String country;
	
	public Agents() {
	}
	
	public String getAgent_Code() {
		return agent_Code;
	}
	public void setAgent_Code(String agent_Code) {
		this.agent_Code = agent_Code;
	}
	public String getAgent_Name() {
		return agent_Name;
	}
	public void setAgent_Name(String agent_Name) {
		this.agent_Name = agent_Name;
	}
	public String getWorking_Area() {
		return working_Area;
	}
	public void setWorking_Area(String working_Area) {
		this.working_Area = working_Area;
	}
	public Double getCommision_Number() {
		return commission;
	}
	public void setCommision_Number(Double commision_Number) {
		this.commission = commision_Number;
	}
	public String getPhone_Number() {
		return phone_No;
	}
	public void setPhone_Number(String phone_Number) {
		this.phone_No = phone_Number;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((agent_Code == null) ? 0 : agent_Code.hashCode());
		result = prime * result + ((agent_Name == null) ? 0 : agent_Name.hashCode());
		result = prime * result + ((commission == null) ? 0 : commission.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((phone_No == null) ? 0 : phone_No.hashCode());
		result = prime * result + ((working_Area == null) ? 0 : working_Area.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agents other = (Agents) obj;
		if (agent_Code == null) {
			if (other.agent_Code != null)
				return false;
		} else if (!agent_Code.equals(other.agent_Code))
			return false;
		if (agent_Name == null) {
			if (other.agent_Name != null)
				return false;
		} else if (!agent_Name.equals(other.agent_Name))
			return false;
		if (commission == null) {
			if (other.commission != null)
				return false;
		} else if (!commission.equals(other.commission))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (phone_No == null) {
			if (other.phone_No != null)
				return false;
		} else if (!phone_No.equals(other.phone_No))
			return false;
		if (working_Area == null) {
			if (other.working_Area != null)
				return false;
		} else if (!working_Area.equals(other.working_Area))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Agents [agent_Code=" + agent_Code + ", agent_Name=" + agent_Name + ", working_Area=" + working_Area
				+ ", commision_Number=" + commission + ", phone_Number=" + phone_No + ", country=" + country
				+ "]";
	}
	
	
	/*
	 * "AGENT_CODE" CHAR(6) NOT NULL PRIMARY KEY, "AGENT_NAME" CHAR(40),
	 * "WORKING_AREA" CHAR(35), "COMMISSION" NUMBER(10,2), "PHONE_NO" CHAR(15),
	 * "COUNTRY" VARCHAR2(25)
	 */
}
