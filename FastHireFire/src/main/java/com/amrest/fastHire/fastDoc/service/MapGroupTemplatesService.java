package com.amrest.fastHire.fastDoc.service;

import java.util.List;

import com.amrest.fastHire.fastDoc.model.MapGroupTemplates;

public interface MapGroupTemplatesService {

	public MapGroupTemplates create(MapGroupTemplates item);

	public MapGroupTemplates update(MapGroupTemplates item);

	public void delete(MapGroupTemplates item);

	public List<MapGroupTemplates> findByGroupID(String groupID);
}
