package org.example.realworldapi.infrastructure.web.model.response;

import io.quarkus.runtime.annotations.RegisterForReflection;
import org.example.realworldapi.application.data.ArticlesData;

import java.util.List;
import java.util.stream.Collectors;

@RegisterForReflection
public class ArticlesResponse {

	private List<ArticleResponse> articles;
	private long articlesCount;

	public ArticlesResponse() {
		super();
	}

	public ArticlesResponse(ArticlesData result) {
		this.articles =
				result.getArticles().stream().map(ArticleResponse::new).collect(Collectors.toList());
		this.articlesCount = result.getArticlesCount();
	}

	public List<ArticleResponse> getArticles() {
		return articles;
	}

	public void setArticles(List<ArticleResponse> articles) {
		this.articles = articles;
	}

	public long getArticlesCount() {
		return articlesCount;
	}

	public void setArticlesCount(long articlesCount) {
		this.articlesCount = articlesCount;
	}

}
