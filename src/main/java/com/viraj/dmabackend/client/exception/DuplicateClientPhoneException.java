package com.viraj.dmabackend.client.exception;

public class DuplicateClientPhoneException extends RuntimeException {

    public DuplicateClientPhoneException(String phoneNumber) {
        super("Client with phone number '" + phoneNumber + "' already exists.");
    }
}