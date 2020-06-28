package org.example.realworldapi.domain.model.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ARTICLES_TAGS")
public class ArticlesTags {

	@EmbeddedId 
	private ArticlesTagsKey primaryKey;

	public ArticlesTags(ArticlesTagsKey primaryKey) {
		this.primaryKey = primaryKey;
	}

	@ManyToOne
	@JoinColumn(insertable = false, updatable = false)
	private Article article;

	@ManyToOne
	@JoinColumn(insertable = false, updatable = false)
	private Tag tag;


	public ArticlesTags() {
		super();
	}

	public ArticlesTagsKey getPrimaryKey() {
		return primaryKey;
	}

	public void setPrimaryKey(ArticlesTagsKey primaryKey) {
		this.primaryKey = primaryKey;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public Tag getTag() {
		return tag;
	}

	public void setTag(Tag tag) {
		this.tag = tag;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;

		if (o == null || getClass() != o.getClass()) return false;

		ArticlesTags that = (ArticlesTags) o;
		return Objects.equals(primaryKey, that.primaryKey);
	}

	@Override
	public int hashCode() {
		return Objects.hash(primaryKey);
	}
}
