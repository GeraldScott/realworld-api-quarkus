package org.example.realworldapi.infrastructure.web.model.response;

import com.fasterxml.jackson.annotation.JsonRootName;
import io.quarkus.runtime.annotations.RegisterForReflection;
import org.example.realworldapi.application.data.ProfileData;

@JsonRootName("profile")
@RegisterForReflection
public class ProfileResponse {

	private String username;
	private String bio;
	private String image;
	private boolean following;

	public ProfileResponse(ProfileData profile) {
		this.username = profile.getUsername();
		this.bio = profile.getBio();
		this.image = profile.getImage();
		this.following = profile.isFollowing();
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

	public boolean isFollowing() {
		return following;
	}

	public void setFollowing(boolean following) {
		this.following = following;
	}

}
