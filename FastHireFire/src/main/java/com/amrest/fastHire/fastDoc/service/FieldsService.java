package com.amrest.fastHire.fastDoc.service;

import java.util.List;

import com.amrest.fastHire.fastDoc.model.Fields;

public interface FieldsService {

	public Fields create(Fields item);

	public Fields update(Fields item);

	public void delete(Fields item);

	public List<Fields> findAll();

	public List<Fields> findByEntity(String entityID);

	public List<Fields> findByID(String id);
}
