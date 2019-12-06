package com.amrest.fastHire.fastDoc.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.amrest.fastHire.fastDoc.model.TemplateTest;

@Transactional
@Component
public class TemplateTestServiceImp implements TemplateTestService {
	@PersistenceContext
	EntityManager em;

	@Override
	public TemplateTest create(TemplateTest item) {
		em.persist(item);
		return item;
	}

	@Override
	public TemplateTest update(TemplateTest item) {
		em.merge(item);
		return item;
	}

	@Override
	public void delete(TemplateTest item) {
		em.remove(item);
	}

	@Override
	public List<TemplateTest> findById(String id) {
		Query query = em.createNamedQuery("TemplateTest.findById").setParameter("id", id);
		@SuppressWarnings("unchecked")
		List<TemplateTest> items = query.getResultList();
		return items;
	}
}
