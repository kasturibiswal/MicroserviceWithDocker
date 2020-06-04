package com.currency.conversion.controller;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.currency.conversion.bean.ConversionFactorResponse;
import com.currency.conversion.bean.CurrencyConversionResponse;

@RestController
public class CurrencyConversionController {
	@Autowired
	CurrencyConversionServiceProxy proxyService;
	
	@Autowired
	CurrencyConversionDelegate currencyConversionDelegate;
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	@GetMapping(path = "/currency/conversion/{amount}/{fromCurrency}/{toCurrency}")
	public CurrencyConversionResponse currencyConversion(@PathVariable Double amount, @PathVariable String fromCurrency,@PathVariable String toCurrency)
	{
		logger.debug("Executing convertCurrency");
		ConversionFactorResponse conversionFactorResponse = currencyConversionDelegate.getConversionFactor(fromCurrency, toCurrency);
		logger.debug("conversionFactorResponse = " +conversionFactorResponse);
		if(null!=conversionFactorResponse && null!=conversionFactorResponse.getConversionFactor()) {
			logger.debug("inside IF");
			Double cAmount=new BigDecimal(conversionFactorResponse.getConversionFactor()*amount).setScale(2, RoundingMode.HALF_DOWN).doubleValue();
			CurrencyConversionResponse currencyConversionResponse = new CurrencyConversionResponse(cAmount,conversionFactorResponse.getErrorMessage());	
			return currencyConversionResponse;
		}
		else {
			logger.debug("inside ELSE");
			CurrencyConversionResponse currencyConversionResponse = new CurrencyConversionResponse(null,conversionFactorResponse.getErrorMessage());
			return currencyConversionResponse;
		}
		
	}

	
	
}
