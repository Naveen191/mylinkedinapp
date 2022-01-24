package com.naveen.myapp.exceptions;

public class InvalidLoginDetailsException extends RuntimeException{
    public InvalidLoginDetailsException(){
        super();
    }
    public InvalidLoginDetailsException(String message){
        super(message);
    }
    public InvalidLoginDetailsException(String message, Throwable cause){
        super(message,cause);
    }
    public InvalidLoginDetailsException(Throwable cause){
        super(cause);
    }
}
