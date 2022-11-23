package com.example.service;

import java.util.List;

import com.example.entity.CountryMaster;

public interface CountryMasterService {

	public void addCountryDetail(CountryMaster countryMaster);

	public void addListOfCountryDetails(List<CountryMaster> countryMasters);

	public CountryMaster getCountryMasterDetails(long countryCode);

	public void deleteCountryMasterDetails(long countryCode);

	public List<CountryMaster> getAllCountryMasterDetails();
	
	public void deleteAllCountryMasterDetails();
}
