package org.example.realworldapi.domain.model.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ARTICLES_USERS")
public class ArticlesUsers {

	@EmbeddedId private ArticlesUsersKey primaryKey;

	@ManyToOne
	@JoinColumn(insertable = false, updatable = false)
	private Article article;

	@ManyToOne
	@JoinColumn(insertable = false, updatable = false)
	private User user;

	public ArticlesUsersKey getPrimaryKey() {
		return primaryKey;
	}

	public void setPrimaryKey(ArticlesUsersKey primaryKey) {
		this.primaryKey = primaryKey;
	}

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

		ArticlesUsers that = (ArticlesUsers) o;
		return Objects.equals(primaryKey, that.primaryKey);
	}

	@Override
	public int hashCode() {
		return Objects.hash(primaryKey);
	}
}
