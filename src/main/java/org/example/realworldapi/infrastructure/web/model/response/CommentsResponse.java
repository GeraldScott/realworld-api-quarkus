package org.example.realworldapi.infrastructure.web.model.response;

import io.quarkus.runtime.annotations.RegisterForReflection;
import org.example.realworldapi.application.data.CommentData;

import java.util.List;
import java.util.stream.Collectors;

@RegisterForReflection
public class CommentsResponse {

	private List<CommentResponse> comments;

	public CommentsResponse(List<CommentData> comments) {
		this.comments = comments.stream().map(CommentResponse::new).collect(Collectors.toList());
	}

	public List<CommentResponse> getComments() {
		return comments;
	}

	public void setComments(List<CommentResponse> comments) {
		this.comments = comments;
	}

}
