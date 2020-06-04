package com.currency.conversionfactor.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Conversion_Factor")
public class ConversionFactor {
	@Id
	private Long id;
	@Column(unique = true)
	private String currency;
	private String country;	
	private Double conversionFactor;	
	
	
	public ConversionFactor() {
		super();
	}


	public ConversionFactor(Long id, String currency, String country, Double conversionFactor) {
		super();
		this.id = id;
		this.currency = currency;
		this.country = country;
		this.conversionFactor = conversionFactor;
	}

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getCurrency() {
		return currency;
	}


	public void setCurrency(String currency) {
		this.currency = currency;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public Double getConversionFactor() {
		return conversionFactor;
	}


	public void setConversionFactor(Double conversionFactor) {
		this.conversionFactor = conversionFactor;
	}



}
