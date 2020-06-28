package org.example.realworldapi.domain.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TAGS")
public class Tag {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tag")
	private List<ArticlesTags> articlesTags;

	public Tag() {
		super();
	}

	public Tag(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ArticlesTags> getArticlesTags() {
		return articlesTags;
	}

	public void setArticlesTags(List<ArticlesTags> articlesTags) {
		this.articlesTags = articlesTags;
	}
}
