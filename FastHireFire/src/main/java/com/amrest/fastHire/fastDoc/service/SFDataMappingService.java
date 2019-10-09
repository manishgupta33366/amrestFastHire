package com.amrest.fastHire.fastDoc.service;

import java.util.List;

import com.amrest.fastHire.fastDoc.model.SFDataMapping;

public interface SFDataMappingService {
	public SFDataMapping create(SFDataMapping item);

	public SFDataMapping update(SFDataMapping item);

	public void delete(SFDataMapping item);

	public List<SFDataMapping> findByKey(String key);

}
