package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@Table(name = "STATE_MASTER")
@AllArgsConstructor
public class StateMaster {

	@Id
	@Column(name = "STATE_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long stateId;

	@Column(name = "STATE_COUNTRY_ID")
	long stateCountryId;

	@Column(name = "STATE_NAME")
	String stateName;

	@Column(name = "STATE_CODE")
	String stateCode;

	public StateMaster() {

	}

	@Override
	public String toString() {
		System.out.println("This state master class");
		return "StateMaster [state_id=" + stateId + ", state_country_id=" + stateCountryId + ", state_name=" + stateName
				+ ", state_code=" + stateCode + "]";
	}

}
