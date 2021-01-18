package com.wonders.fundraiser.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.wonders.fundraiser.model.News;

@Service
public class NewsService {

  @Value("${news.url}")
  private String newsUrl;

  @Value("${api.key}")
  private String apiKey;

  private RestTemplate restTemplate;

  public NewsService(RestTemplateBuilder restTemplateBuilder) {
    this.restTemplate = restTemplateBuilder.build();
  }

	public News getTopStories(String section) {
    return this.restTemplate.getForObject(newsUrl + "=" + apiKey,
          News.class, section);
	}
}
