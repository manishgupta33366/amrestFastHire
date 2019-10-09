package com.amrest.fastHire.fastDoc.service;

import java.util.List;

import com.amrest.fastHire.fastDoc.model.Rules;

public interface RulesService {
	public Rules create(Rules item);

	public Rules update(Rules item);

	public void delete(Rules item);

	public List<Rules> findByRuleID(String ruleID);

	public List<Rules> findByRuleName(String name);
}
