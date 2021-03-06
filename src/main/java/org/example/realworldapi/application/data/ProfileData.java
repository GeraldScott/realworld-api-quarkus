package org.example.realworldapi.application.data;

public class ProfileData {

	private String username;
	private String bio;
	private String image;
	private boolean following;

	public ProfileData() {
		super();
	}

	public ProfileData(String username, String bio, String image, boolean following) {
		super();
		this.username = username;
		this.bio = bio;
		this.image = image;
		this.following = following;
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
