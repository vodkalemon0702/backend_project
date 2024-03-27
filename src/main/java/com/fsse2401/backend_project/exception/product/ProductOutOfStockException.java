package com.fsse2401.backend_project.exception.product;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ProductOutOfStockException extends RuntimeException{
    public ProductOutOfStockException(Integer stock){
        super(String.format("Product out of stock - stock: %s",stock));
    }
}
