package com.amrest.fastHire.fastDoc.service;

import java.util.List;

import com.amrest.fastHire.fastDoc.model.Groups;

public interface GroupsService {
	public Groups create(Groups item);

	public Groups update(Groups item);

	public void delete(Groups item);

	public List<Groups> findAll();

}
