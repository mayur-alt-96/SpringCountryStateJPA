package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.CountryMaster;

@Repository
public interface CountryMasterDao extends JpaRepository<CountryMaster, Long> {

}
