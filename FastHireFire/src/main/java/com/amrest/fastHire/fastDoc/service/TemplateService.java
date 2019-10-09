package com.amrest.fastHire.fastDoc.service;

import java.util.List;

import com.amrest.fastHire.fastDoc.model.Templates;

public interface TemplateService {
	public Templates create(Templates item);

	public Templates update(Templates item);

	public void delete(Templates item);

	public List<Templates> findById(String id);
}
