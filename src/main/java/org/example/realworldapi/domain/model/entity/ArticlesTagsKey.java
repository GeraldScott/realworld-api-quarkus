package org.example.realworldapi.domain.model.entity;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ArticlesTagsKey implements Serializable {

	private static final long serialVersionUID = -2299280043529436639L;

	@ManyToOne 
	private Article article;

	@ManyToOne 
	private Tag tag;

	public ArticlesTagsKey() {
		super();
	}

	public ArticlesTagsKey(Article article, Tag tag) {
		super();
		this.article = article;
		this.tag = tag;
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

		ArticlesTagsKey that = (ArticlesTagsKey) o;
		return Objects.equals(article, that.article) && Objects.equals(tag, that.tag);
	}

	@Override
	public int hashCode() {
		return Objects.hash(article, tag);
	}
}
