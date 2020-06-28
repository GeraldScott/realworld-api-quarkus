package org.example.realworldapi.infrastructure.web.model.response;

import com.fasterxml.jackson.annotation.JsonRootName;
import io.quarkus.runtime.annotations.RegisterForReflection;
import org.example.realworldapi.domain.model.entity.User;

@JsonRootName("user")
@RegisterForReflection
public class UserResponse {

	private String username;
	private String bio;
	private String image;
	private String email;
	private String token;

	public UserResponse() {
		super();
	}

	public UserResponse(User user) {
		this.username = user.getUsername();
		this.bio = user.getBio();
		this.image = user.getImage();
		this.email = user.getEmail();
		this.token = user.getToken();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
