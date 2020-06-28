package org.example.realworldapi.domain.model.exception;

public class UsernameAlreadyExistsException extends BusinessException {

    private static final long serialVersionUID = 1573919886595954203L;

	public UsernameAlreadyExistsException(){
        super("username already exists");
    }

}
