package com.amrest.fastHire.fastDoc.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.amrest.fastHire.fastDoc.model.FormatSeparators;

@Transactional
@Component
public class FormatSeparatorsServiceImp implements FormatSeparatorsService {
	@PersistenceContext
	EntityManager em;

	@Override
	@Transactional
	public FormatSeparators create(FormatSeparators item) {
		em.persist(item);
		return item;
	}

	@Override
	@Transactional
	public FormatSeparators update(FormatSeparators item) {
		em.merge(item);
		return item;
	}

	@Override
	@Transactional
	public void delete(FormatSeparators item) {
		em.remove(item);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<FormatSeparators> findAll() {
		Query query = em.createNamedQuery("FormatSeparators.selectAll");
		List<FormatSeparators> items = query.getResultList();
		return items;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<FormatSeparators> findByRuleFieldIdCountry(String mapRuleFieldId, String country) {
		Query query = em.createNamedQuery("FormatSeparators.findByRuleFieldIdCountry")
				.setParameter("mapRuleFieldId", mapRuleFieldId).setParameter("country", country);
		List<FormatSeparators> items = query.getResultList();
		return items;
	}
}
