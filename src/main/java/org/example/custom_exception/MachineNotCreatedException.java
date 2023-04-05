package org.example.custom_exception;

public class MachineNotCreatedException extends Exception {
    public MachineNotCreatedException(String message){
        super(message);
    }
}
