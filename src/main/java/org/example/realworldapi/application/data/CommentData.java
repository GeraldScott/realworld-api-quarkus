package org.example.realworldapi.application.data;

import java.time.LocalDateTime;

public class CommentData {

	private Long id;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	private String body;
	private ProfileData author;

	public CommentData() {
		super();
	}

	public CommentData(Long id, LocalDateTime createdAt, LocalDateTime updatedAt, String body, ProfileData author) {
		super();
		this.id = id;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.body = body;
		this.author = author;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public ProfileData getAuthor() {
		return author;
	}

	public void setAuthor(ProfileData author) {
		this.author = author;
	}

}
