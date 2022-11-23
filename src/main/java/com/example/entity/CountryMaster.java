package com.example.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@Table(name = "COUNTRY_MASTER")
@AllArgsConstructor
public class CountryMaster {

	@Id
	@Column(name = "COUNTRY_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long countryId;

	@Column(name = "COUNTRY_NAME")
	String countryName;

	@Column(name = "COUNTRY_ISD_CODE")
	long countryIsdCode;

	@Column(name = "COUNTRY_POSTAL_CODE")
	long countryPostalCode;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "STATE_COUNTRY_ID", referencedColumnName = "COUNTRY_ID")
	List<StateMaster> stateDetails = new ArrayList<>();

	public CountryMaster() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "country_id :" + this.countryId + " country_Name: " + this.countryName + " country_Isd_Code :"
				+ this.countryIsdCode + " country_Postal_Code :" + this.countryPostalCode + " state_Details :"
				+ this.stateDetails;

	}
}
