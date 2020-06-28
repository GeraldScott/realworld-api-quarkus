package org.example.realworldapi.domain.model.entity;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ArticlesUsersKey implements Serializable {

	private static final long serialVersionUID = 7116785167109500716L;

	@ManyToOne 
	private Article article;

	@ManyToOne 
	private User user;

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;

		if (o == null || getClass() != o.getClass()) return false;

		ArticlesUsersKey that = (ArticlesUsersKey) o;
		return Objects.equals(user, that.user) && Objects.equals(article, that.article);
	}

	@Override
	public int hashCode() {
		return Objects.hash(user, article);
	}
}
