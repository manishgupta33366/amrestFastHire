package com.amrest.fastHire.fastDoc.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.amrest.fastHire.fastDoc.model.Templates;

@Transactional
@Component
public class TemplateFastDocServiceImp implements TemplateFastDocService {
	@PersistenceContext
	EntityManager em;

	@Override
	public Templates create(Templates item) {
		em.persist(item);
		return item;
	}

	@Override
	public Templates update(Templates item) {
		em.merge(item);
		return item;
	}

	@Override
	public void delete(Templates item) {
		em.remove(item);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Templates> findById(String id) {
		Query query = em.createNamedQuery("Templates.findById").setParameter("id", id);
		List<Templates> items = query.getResultList();
		return items;
	}

}
