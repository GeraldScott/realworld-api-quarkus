package org.example.realworldapi.infrastructure.web.model.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonRootName;
import io.quarkus.runtime.annotations.RegisterForReflection;
import org.example.realworldapi.application.data.ArticleData;
import org.example.realworldapi.application.data.ProfileData;

import java.time.LocalDateTime;
import java.util.List;

@JsonRootName("article")
@RegisterForReflection
public class ArticleResponse {

	private String slug;
	private String title;
	private String description;
	private String body;
	private List<String> tagList;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
	private LocalDateTime createdAt;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
	private LocalDateTime updatedAt;

	private boolean favorited;
	private long favoritesCount;
	private ProfileData author;

	public ArticleResponse() {
		super();
	}

	public ArticleResponse(ArticleData articleData) {
		this.slug = articleData.getSlug();
		this.title = articleData.getTitle();
		this.description = articleData.getDescription();
		this.body = articleData.getBody();
		this.tagList = articleData.getTagList();
		this.createdAt = articleData.getCreatedAt();
		this.updatedAt = articleData.getUpdatedAt();
		this.favorited = articleData.isFavorited();
		this.favoritesCount = articleData.getFavoritesCount();
		this.author = articleData.getAuthor();
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

	public ProfileData getAuthor() {
		return author;
	}

	public void setAuthor(ProfileData author) {
		this.author = author;
	}

}
