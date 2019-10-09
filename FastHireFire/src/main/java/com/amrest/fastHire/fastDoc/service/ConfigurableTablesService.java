package com.amrest.fastHire.fastDoc.service;

import java.util.List;

import com.amrest.fastHire.fastDoc.model.ConfigurableTables;

public interface ConfigurableTablesService {
	public ConfigurableTables create(ConfigurableTables item);

	public ConfigurableTables update(ConfigurableTables item);

	public void delete(ConfigurableTables item);

	public List<ConfigurableTables> findAll();

	public ConfigurableTables findById(String id);
}
