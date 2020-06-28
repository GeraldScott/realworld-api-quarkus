package org.example.realworldapi.infrastructure.web.model.request;

import com.fasterxml.jackson.annotation.JsonRootName;
import io.quarkus.runtime.annotations.RegisterForReflection;
import org.example.realworldapi.domain.model.constants.ValidationMessages;

import javax.validation.constraints.NotBlank;

@JsonRootName("comment")
@RegisterForReflection
public class NewCommentRequest {
	@NotBlank(message = ValidationMessages.BODY_MUST_BE_NOT_BLANK)
	private String body;

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

}
