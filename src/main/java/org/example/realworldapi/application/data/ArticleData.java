package org.example.realworldapi.application.data;

import io.quarkus.runtime.annotations.RegisterForReflection;

import java.time.LocalDateTime;
import java.util.List;

@RegisterForReflection
public class ArticleData {

	private String slug;
	private String title;
	private String description;
	private String body;
	private List<String> tagList;
	private boolean favorited;
	private long favoritesCount;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	private ProfileData author;

	public ArticleData(String slug, String title, String description, String body, List<String> tagList, boolean favorited,
			long favoritesCount, LocalDateTime createdAt, LocalDateTime updatedAt, ProfileData author) {
		super();
		this.slug = slug;
		this.title = title;
		this.description = description;
		this.body = body;
		this.tagList = tagList;
		this.favorited = favorited;
		this.favoritesCount = favoritesCount;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.author = author;
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

	public List<String> getTagList() {
		return tagList;
	}

	public void setTagList(List<String> tagList) {
		this.tagList = tagList;
	}

	public boolean isFavorited() {
		return favorited;
	}

	public void setFavorited(boolean favorited) {
		this.favorited = favorited;
	}

	public long getFavoritesCount() {
		return favoritesCount;
	}

	public void setFavoritesCount(long favoritesCount) {
		this.favoritesCount = favoritesCount;
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

	public ProfileData getAuthor() {
		return author;
	}

	public void setAuthor(ProfileData author) {
		this.author = author;
	}

}
