package com.viraj.dmabackend.client.exception;

public class DuplicateClientGstException extends RuntimeException {

    public DuplicateClientGstException(String gstNumber) {
        super("Client with GST number '" + gstNumber + "' already exists.");
    }
}