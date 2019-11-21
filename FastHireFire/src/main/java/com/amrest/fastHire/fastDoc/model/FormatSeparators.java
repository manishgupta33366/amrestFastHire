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
 * TableName: DGENC_FIELDS
 * 
 * @author	:	Manish Gupta  
 * @email	:	manish.g@ngahr.com
 * @version	:	0.0.1
 */

@Entity
@Table(name = DBConfiguration.FORMAT_SEPARATORS, schema = DBConfiguration.SCHEMA_NAME)
@NamedQueries({ @NamedQuery(name = "FormatSeparators.selectAll", query = "SELECT FS FROM FormatSeparators FS"),
		@NamedQuery(name = "FormatSeparators.findByRuleFieldIdCountry", query = "SELECT FS FROM FormatSeparators FS WHERE FS.mapRuleFieldId = :mapRuleFieldId and FS.country = :country") })
public class FormatSeparators {

	@Id
	@Column(name = "\"MAP_RULE_FIELD.ID\"", columnDefinition = "VARCHAR(32)")
	private String mapRuleFieldId;

	@Id
	@Column(name = "\"COUNTRY\"", columnDefinition = "VARCHAR(32)")
	private String country;

	@Column(name = "\"SEPARATOR\"", columnDefinition = "VARCHAR(32)")
	private String separator;

	public String getMapRuleFieldId() {
		return mapRuleFieldId;
	}

	public void setMapRuleFieldId(String ruleID) {
		this.mapRuleFieldId = ruleID;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getSeparator() {
		return separator;
	}

	public void setSeparator(String separator) {
		this.separator = separator;
	}

}
