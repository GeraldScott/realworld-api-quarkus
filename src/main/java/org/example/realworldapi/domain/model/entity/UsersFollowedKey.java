package org.example.realworldapi.domain.model.entity;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class UsersFollowedKey implements Serializable {

	private static final long serialVersionUID = 5899379552414538183L;

	@ManyToOne private User user;

	@ManyToOne private User followed;


	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public User getFollowed() {
		return followed;
	}

	public void setFollowed(User followed) {
		this.followed = followed;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;

		if (o == null || getClass() != o.getClass()) return false;

		UsersFollowedKey that = (UsersFollowedKey) o;
		return Objects.equals(user, that.user) && Objects.equals(followed, that.followed);
	}

	@Override
	public int hashCode() {
		return Objects.hash(user, followed);
	}
}
