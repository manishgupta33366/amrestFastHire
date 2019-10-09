package com.amrest.fastHire.fastDoc.service;

import java.util.List;

import com.amrest.fastHire.fastDoc.model.ConfigurableColumns;
import com.amrest.fastHire.fastDoc.model.Countries;

public interface CountryService {

	public Countries create(Countries item);

	public Countries update(Countries item);

	public void delete(Countries item);

	public List<Countries> findAll();

	public Countries findById(String id);

	public List<Countries> dynamicSelect(List<ConfigurableColumns> requiredColumns);

	List<Countries> findAll(String locale);
}
