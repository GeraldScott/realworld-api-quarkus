package org.example.realworldapi.infrastructure.web.model.request;

import com.fasterxml.jackson.annotation.JsonRootName;
import io.quarkus.runtime.annotations.RegisterForReflection;
import org.example.realworldapi.domain.model.constants.ValidationMessages;

import javax.validation.constraints.NotBlank;
import java.util.List;

@JsonRootName("article")
@RegisterForReflection
public class NewArticleRequest {

	@NotBlank(message = ValidationMessages.TITLE_MUST_BE_NOT_BLANK)
	private String title;

	@NotBlank(message = ValidationMessages.DESCRIPTION_MUST_BE_NOT_BLANK)
	private String description;

	@NotBlank(message = ValidationMessages.BODY_MUST_BE_NOT_BLANK)
	private String body;

	private List<String> tagList;

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
}
