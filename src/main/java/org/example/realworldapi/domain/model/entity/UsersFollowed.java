package org.example.realworldapi.domain.model.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "FOLLOWED_USERS")
public class UsersFollowed {
	
	@EmbeddedId private UsersFollowedKey primaryKey;

	@ManyToOne
	@JoinColumn(insertable = false, updatable = false)
	private User user;

	@ManyToOne
	@JoinColumn(insertable = false, updatable = false)
	private User followed;

	public UsersFollowedKey getPrimaryKey() {
		return primaryKey;
	}

	public void setPrimaryKey(UsersFollowedKey primaryKey) {
		this.primaryKey = primaryKey;
	}

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

		UsersFollowed that = (UsersFollowed) o;
		return Objects.equals(primaryKey, that.primaryKey);
	}

	@Override
	public int hashCode() {
		return Objects.hash(primaryKey);
	}
}
