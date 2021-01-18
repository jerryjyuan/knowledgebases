package com.wonders.fundraiser.model;

import java.util.List;

//import javax.persistence.Entity;
//import javax.persistence.Id;

//@Entity
public class News {
	
  private String status;
  private String copyright;
  //@Id
  private String section;
  private String last_updated;
  private Integer num_results;
  private List<Article> results;

  public News() {}

  public News(String status, String copyright, String section, String last_updated,
		  Integer num_results, List<Article> results) {
	  this.status = status;
	  this.copyright = copyright;
	  this.section = section;
	  this.last_updated = last_updated;
	  this.num_results = num_results;
	  this.results = results;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getCopyright() {
    return copyright;
  }

  public void setCopyright(String copyright) {
    this.copyright = copyright;
  }

  public String getSection() {
    return section;
  }

  public void setSection(String section) {
    this.section = section;
  }

  public String getLast_updated() {
    return last_updated;
  }

  public void setLast_updated(String last_updated) {
    this.last_updated = last_updated;
  }

  public Integer getNum_results() {
    return num_results;
  }

  public void setNum_results(Integer num_results) {
    this.num_results = num_results;
  }

  public List<Article> getResults() {
    return results;
  }

  public void setResults(List<Article> results) {
    this.results = results;
  }

}
