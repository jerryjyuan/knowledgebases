package com.wonders.fundraiser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wonders.fundraiser.model.News;
import com.wonders.fundraiser.service.NewsService;

@RestController
@RequestMapping("/api/news")
public class NewsController {

  @Autowired
  private NewsService newsService;

	@RequestMapping(value = "/topstories", method = RequestMethod.GET)
	public News getNews() throws Exception {
    String section = "home";
		return newsService.getTopStories(section);
	}

}