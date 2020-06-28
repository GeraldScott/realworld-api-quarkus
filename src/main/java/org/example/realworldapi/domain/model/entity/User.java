package org.example.realworldapi.domain.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "USERS")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String username;
	private String bio;
	private String image;
	private String password;
	private String email;

	@Column(length = 500)
	private String token;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "author_id")
	private List<Article> articles;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	private List<UsersFollowed> following;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "followed")
	private List<UsersFollowed> followedBy;

	public User() {
		super();
	}

	public User(Long id, String username, String bio, String image) {
		this.id = id;
		this.username = username;
		this.bio = bio;
		this.image = image;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	public List<UsersFollowed> getFollowing() {
		return following;
	}

	public void setFollowing(List<UsersFollowed> following) {
		this.following = following;
	}

	public List<UsersFollowed> getFollowedBy() {
		return followedBy;
	}

	public void setFollowedBy(List<UsersFollowed> followedBy) {
		this.followedBy = followedBy;
	}
}
