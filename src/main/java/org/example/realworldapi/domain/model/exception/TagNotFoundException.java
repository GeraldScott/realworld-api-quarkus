package org.example.realworldapi.domain.model.exception;

public class TagNotFoundException extends BusinessException {

  private static final long serialVersionUID = -7625848237997638861L;

public TagNotFoundException() {
    super("tag not found");
  }
}
