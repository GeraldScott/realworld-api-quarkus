package org.example.realworldapi.infrastructure.web.model.response;

import com.fasterxml.jackson.annotation.JsonRootName;
import io.quarkus.runtime.annotations.RegisterForReflection;

import java.util.LinkedList;
import java.util.List;

@JsonRootName("errors")
@RegisterForReflection
public class ErrorResponse {

	private List<String> body;

	public ErrorResponse() {
		this.body = new LinkedList<>();
	}

	public ErrorResponse(String error) {
		this();
		this.body.add(error);
	}

	public List<String> getBody() {
		return body;
	}

	public void setBody(List<String> body) {
		this.body = body;
	}

}
