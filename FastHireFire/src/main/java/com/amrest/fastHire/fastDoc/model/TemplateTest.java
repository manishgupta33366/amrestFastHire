package com.amrest.fastHire.fastDoc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.amrest.fastHire.fastDoc.config.DBConfiguration;

/*
 * AppName: DocGen
 * TableName: DGEN_TEMPLATES
 * 
 * @author	:	Manish Gupta  
 * @email	:	manish.g@ngahr.com
 * @version	:	0.0.1
 */

@Entity
@Table(name = DBConfiguration.TEMPLATE_TEST, schema = DBConfiguration.SCHEMA_NAME)
@NamedQueries({
		@NamedQuery(name = "TemplateTest.findById", query = "SELECT TT FROM TemplateTest TT WHERE TT.id = :id") })
public class TemplateTest {
	@Id
	@Column(name = "\"ID\"", columnDefinition = "VARCHAR(32)")
	private String id;

	@Column(name = "\"TEMPLATE\"", columnDefinition = "BLOB")
	private byte[] template;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public byte[] getTemplate() {
		return template;
	}

	public void setTemplate(byte[] template) {
		this.template = template;
	}
}
