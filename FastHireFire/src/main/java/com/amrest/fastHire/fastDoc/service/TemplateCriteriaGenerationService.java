package com.amrest.fastHire.fastDoc.service;

import java.util.List;

import com.amrest.fastHire.fastDoc.model.Fields;
import com.amrest.fastHire.fastDoc.model.TemplateCriteriaGeneration;

public interface TemplateCriteriaGenerationService {
	public TemplateCriteriaGeneration create(TemplateCriteriaGeneration item);

	public TemplateCriteriaGeneration update(TemplateCriteriaGeneration item);

	public void delete(TemplateCriteriaGeneration item);

	public List<TemplateCriteriaGeneration> findByTemplateID(String templateID);

	public List<Fields> getDistinctFields();
}
