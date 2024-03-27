package com.fsse2401.backend_project.exception.product;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ProductListEmptyException extends RuntimeException{
    public ProductListEmptyException(){
        super("Product list is empty");
    }
}
