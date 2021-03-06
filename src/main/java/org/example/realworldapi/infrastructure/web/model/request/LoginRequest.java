package org.example.realworldapi.infrastructure.web.model.request;

import com.fasterxml.jackson.annotation.JsonRootName;
import io.quarkus.runtime.annotations.RegisterForReflection;

import org.example.realworldapi.domain.model.constants.ValidationMessages;

import javax.validation.constraints.NotBlank;

@JsonRootName("user")
@RegisterForReflection
public class LoginRequest {

	@NotBlank(message = ValidationMessages.EMAIL_MUST_BE_NOT_BLANK)
	private String email;

	@NotBlank(message = ValidationMessages.PASSWORD_MUST_BE_NOT_BLANK)
	private String password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
