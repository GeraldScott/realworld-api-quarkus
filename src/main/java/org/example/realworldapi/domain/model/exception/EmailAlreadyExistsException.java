package org.example.realworldapi.domain.model.exception;

public class EmailAlreadyExistsException extends BusinessException {

    private static final long serialVersionUID = -2663630734501812344L;

	public EmailAlreadyExistsException(){
        super("email already exists");
    }

}
