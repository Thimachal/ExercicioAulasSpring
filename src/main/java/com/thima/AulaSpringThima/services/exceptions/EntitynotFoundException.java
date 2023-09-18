package com.thima.AulaSpringThima.services.exceptions;

public class EntitynotFoundException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    public EntitynotFoundException(String msg){
        super(msg);
    }

}
