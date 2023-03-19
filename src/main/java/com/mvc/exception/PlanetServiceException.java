package com.mvc.exception;

import com.mvc.request.PlanetCreationRequest;

public class PlanetServiceException extends RuntimeException{
    public PlanetServiceException(String message) {
        super(message);
    }
}
