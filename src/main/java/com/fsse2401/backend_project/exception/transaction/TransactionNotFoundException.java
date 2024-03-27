package com.fsse2401.backend_project.exception.transaction;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class TransactionNotFoundException extends RuntimeException{
    public TransactionNotFoundException(Integer tid){
        super(String.format("Transaction not found - transaction ID: %s",tid));
    }
}
