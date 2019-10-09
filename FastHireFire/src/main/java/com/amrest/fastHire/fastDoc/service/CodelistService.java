package com.amrest.fastHire.fastDoc.service;

import java.util.List;

import com.amrest.fastHire.fastDoc.model.Codelist;

public interface CodelistService {
	public Codelist create(Codelist item);

	public Codelist update(Codelist item);

	public void delete(Codelist item);

	public List<Codelist> findByFieldAndKey(String fieldID, String sfKey);
}
