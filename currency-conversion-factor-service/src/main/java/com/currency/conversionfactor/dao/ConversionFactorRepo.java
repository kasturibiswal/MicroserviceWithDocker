package com.currency.conversionfactor.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.currency.conversionfactor.bean.ConversionFactor;

public interface ConversionFactorRepo extends JpaRepository<ConversionFactor, Long>{
	
	public ConversionFactor findByCurrency(String currency);

}
