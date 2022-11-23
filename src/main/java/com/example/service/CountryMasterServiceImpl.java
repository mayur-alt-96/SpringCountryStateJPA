package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.CountryMasterDao;
import com.example.entity.CountryMaster;

@Service
public class CountryMasterServiceImpl implements CountryMasterService {

	@Autowired
	public CountryMasterDao countryMasterDao;

	@Override
	public void addCountryDetail(CountryMaster countryMaster) {
		countryMasterDao.save(countryMaster);
	}

	@Override
	public void addListOfCountryDetails(List<CountryMaster> countryMastersList) {
		for (CountryMaster countryEntity : countryMastersList) {
			countryMasterDao.save(countryEntity);
		}
	}

	@Override
	public CountryMaster getCountryMasterDetails(long countryCode) {
		Optional<CountryMaster> countryMasterDetails = countryMasterDao.findById(countryCode);
		return countryMasterDetails.get();
	}	

	@Override
	public void deleteCountryMasterDetails(long countryCode) {
		countryMasterDao.deleteById(countryCode);
	}

	@Override
	public List<CountryMaster> getAllCountryMasterDetails() {
		return countryMasterDao.findAll();
	}

	@Override
	public void deleteAllCountryMasterDetails() {
		countryMasterDao.deleteAll();
	}

}
