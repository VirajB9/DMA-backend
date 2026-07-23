package com.viraj.dmabackend.client.exception;

public class DuplicateClientEmailException extends RuntimeException {

    public DuplicateClientEmailException(String email) {
        super("Client with email '" + email + "' already exists.");
    }
}