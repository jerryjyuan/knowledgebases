package com.wonders.fundraiser.model;

//@Entity
public class Article {

  //@Id
  private String section;
  private String subsection;
  private String title;
  private String url;
  private String uri;
  private String byline;
  private String item_type;
  private String updated_date;
  private String created_date;
  private String published_date;
  private String material_type_facet;
  private String kicker;
  private String short_url;
  
  public Article() {}

  public Article(String section, String subsection, String title, String url) {
	  this.section = section;
	  this.subsection = subsection;
	  this.title = title;
	  this.url = url;
  }

public String getSection() {
	return section;
}

public void setSection(String section) {
	this.section = section;
}

public String getSubsection() {
	return subsection;
}

public void setSubsection(String subsection) {
	this.subsection = subsection;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getUrl() {
	return url;
}

public void setUrl(String url) {
	this.url = url;
}

public String getUri() {
	return uri;
}

public void setUri(String uri) {
	this.uri = uri;
}

public String getByline() {
	return byline;
}

public void setByline(String byline) {
	this.byline = byline;
}

public String getItem_type() {
	return item_type;
}

public void setItem_type(String item_type) {
	this.item_type = item_type;
}

public String getUpdated_date() {
	return updated_date;
}

public void setUpdated_date(String updated_date) {
	this.updated_date = updated_date;
}

public String getCreated_date() {
	return created_date;
}

public void setCreated_date(String created_date) {
	this.created_date = created_date;
}

public String getPublished_date() {
	return published_date;
}

public void setPublished_date(String published_date) {
	this.published_date = published_date;
}

public String getMaterial_type_facet() {
	return material_type_facet;
}

public void setMaterial_type_facet(String material_type_facet) {
	this.material_type_facet = material_type_facet;
}

public String getKicker() {
	return kicker;
}

public void setKicker(String kicker) {
	this.kicker = kicker;
}

public String getShort_url() {
	return short_url;
}

public void setShort_url(String short_url) {
	this.short_url = short_url;
}
  
  
}
