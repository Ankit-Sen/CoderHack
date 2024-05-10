package com.crio.coderHack.exceptions;

public class InvalidUserDetails extends Exception{
    
    public InvalidUserDetails() {
        super();
    }
    
    public InvalidUserDetails(String message) {
        super(message);
    }
}
