package org.example.custom_exception;

public class UserNotEntitledException extends Exception{
    public UserNotEntitledException(String message){
        super(message);
    }
}
