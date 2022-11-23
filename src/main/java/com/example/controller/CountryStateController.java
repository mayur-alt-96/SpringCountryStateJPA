package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.CountryMaster;
import com.example.service.CountryMasterService;

@RestController
@RequestMapping("/countryapi")
public class CountryStateController {

	@Autowired
	public CountryMasterService countryMasterService;

	@PostMapping("/addCountryDetail")
	public String addCountryDetail(@RequestBody CountryMaster countryMaster) {
		countryMasterService.addCountryDetail(countryMaster);
		return "Inserted country master details successfully";
	}

	@PostMapping("/addListOfCountryDetails")
	public String addListOfCountryDetails(@RequestBody List<CountryMaster> countryMasters) {
		countryMasterService.addListOfCountryDetails(countryMasters);
		return "Inserted List of country master details successfully";
	}

	@GetMapping("/getCountryMasterDetails/{countryId}")
	public ResponseEntity<CountryMaster> getCountryMasterDetails(@PathVariable("countryId") long countryId) {
		CountryMaster countryMasterDetails = countryMasterService.getCountryMasterDetails(countryId);
		return new ResponseEntity<CountryMaster>(countryMasterDetails, HttpStatus.OK);
	}

	@GetMapping("/getAllCountryMasterDetails")
	public ResponseEntity<List<CountryMaster>> getAllCountryMasterDetails() {
		List<CountryMaster> countryMasterDetails = countryMasterService.getAllCountryMasterDetails();
		return new ResponseEntity<List<CountryMaster>>(countryMasterDetails, HttpStatus.OK);
	}

	@RequestMapping("/deleteCountryMasterDetails/{countryId}")
	public String deleteCountryMasterDetails(@PathVariable("countryId") long countryId) {
		countryMasterService.deleteCountryMasterDetails(countryId);
		return "Deleted successfully";
	}

	@RequestMapping("/deleteAllCountryMasterDetails")
	public String deleteAllCountryMasterDetails() {
		countryMasterService.deleteAllCountryMasterDetails();
		return "Deleted all details successfully";
	}

}
