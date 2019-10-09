package com.amrest.fastHire.fastDoc.service;

import java.util.List;

import com.amrest.fastHire.fastDoc.model.Entities;

public interface EntitiesService {

	public Entities create(Entities item);

	public Entities update(Entities item);

	public void delete(Entities item);

	public List<Entities> findAll();

	public List<Entities> findAllDependant(String entityID);

	public List<String> getDistinctNames();
}
