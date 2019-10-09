package com.amrest.fastHire.fastDoc.service;

import java.util.List;

import com.amrest.fastHire.fastDoc.model.CountrySpecificFields;

public interface CountrySpecificFieldsService {
	public CountrySpecificFields create(CountrySpecificFields item);

	public CountrySpecificFields update(CountrySpecificFields item);

	public void delete(CountrySpecificFields item);

	public List<CountrySpecificFields> findByTypeAndCountry(String type, String country);
}
