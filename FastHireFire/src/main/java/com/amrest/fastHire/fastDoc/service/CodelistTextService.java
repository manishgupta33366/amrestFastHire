package com.amrest.fastHire.fastDoc.service;

import java.util.List;

import com.amrest.fastHire.fastDoc.model.CodelistText;

public interface CodelistTextService {
	public CodelistText create(CodelistText item);

	public CodelistText update(CodelistText item);

	public void delete(CodelistText item);

	public List<CodelistText> findByCodelistLanguage(String codeListID, String language);
}
