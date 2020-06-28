package org.example.realworldapi.domain.model.builder;

import org.example.realworldapi.domain.model.entity.Article;
import org.example.realworldapi.domain.model.entity.User;

public class ArticleBuilder {

	private Long id;
	private String slug;
	private String title;
	private String description;
	private String body;
	private User author;

	public ArticleBuilder id(Long id) {
		this.id = id;
		return this;
	}

	public ArticleBuilder slug(String slug) {
		this.slug = slug;
		return this;
	}

	public ArticleBuilder title(String title) {
		this.title = title;
		return this;
	}

	public ArticleBuilder description(String description) {
		this.description = description;
		return this;
	}

	public ArticleBuilder body(String body) {
		this.body = body;
		return this;
	}

	public ArticleBuilder author(User author) {
		this.author = author;
		return this;
	}

	public Article build() {
		return new Article(
				this.id,
				this.slug,
				this.title,
				this.description,
				this.body,
				null,
				null,
				this.author,
				null,
				null,
				null);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

}
