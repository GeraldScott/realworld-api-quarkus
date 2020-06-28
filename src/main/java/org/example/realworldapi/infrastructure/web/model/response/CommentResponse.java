package org.example.realworldapi.infrastructure.web.model.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonRootName;
import io.quarkus.runtime.annotations.RegisterForReflection;
import org.example.realworldapi.application.data.CommentData;
import org.example.realworldapi.application.data.ProfileData;

import java.time.LocalDateTime;

@JsonRootName("comment")
@RegisterForReflection
public class CommentResponse {

	private Long id;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
	private LocalDateTime createdAt;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
	private LocalDateTime updatedAt;

	private String body;
	private ProfileData author;

	public CommentResponse() {
		super();
	}

	public CommentResponse(CommentData commentData) {
		this.id = commentData.getId();
		this.createdAt = commentData.getCreatedAt();
		this.updatedAt = commentData.getUpdatedAt();
		this.body = commentData.getBody();
		this.author = commentData.getAuthor();
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
