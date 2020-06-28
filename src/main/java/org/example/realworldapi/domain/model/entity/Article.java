package org.example.realworldapi.domain.model.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "ARTICLES")
public class Article {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String slug;
	private String title;
	private String description;
	private String body;
	@CreationTimestamp private LocalDateTime createdAt;
	@UpdateTimestamp private LocalDateTime updatedAt;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "author_id")
	private User author;

	@OneToMany(mappedBy = "article", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Comment> comments;

	@OneToMany(mappedBy = "article", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<ArticlesTags> tags;

	@OneToMany(mappedBy = "article", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<ArticlesUsers> favorites;

	public Article() {
		super();
	}

	public Article(Long id, String slug, String title, String description, String body, LocalDateTime createdAt,
			LocalDateTime updatedAt, User author, List<Comment> comments, List<ArticlesTags> tags,
			List<ArticlesUsers> favorites) {
		super();
		this.id = id;
		this.slug = slug;
		this.title = title;
		this.description = description;
		this.body = body;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.author = author;
		this.comments = comments;
		this.tags = tags;
		this.favorites = favorites;
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

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public List<ArticlesTags> getTags() {
		return tags;
	}

	public void setTags(List<ArticlesTags> tags) {
		this.tags = tags;
	}

	public List<ArticlesUsers> getFavorites() {
		return favorites;
	}

	public void setFavorites(List<ArticlesUsers> favorites) {
		this.favorites = favorites;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;

		if (o == null || getClass() != o.getClass()) return false;

		Article that = (Article) o;
		return Objects.equals(id, that.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}
