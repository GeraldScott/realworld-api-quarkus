package org.example.realworldapi.domain.model.exception;

public class ArticleNotFoundException extends BusinessException {

	private static final long serialVersionUID = 4054100265013783511L;

	public ArticleNotFoundException() {
		super("article not found");
	}
}
