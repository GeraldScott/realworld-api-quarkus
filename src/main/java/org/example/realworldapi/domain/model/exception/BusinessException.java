package org.example.realworldapi.domain.model.exception;

public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = -5939540543633257022L;

	public BusinessException(){
    }

    public BusinessException(String message){
        super(message);
    }

}
