package com.ecommerce.micrommerce.web.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Mohamed ouokki on 11/13/22
 * @project 4668056-Construisez-des-Microservices
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ProduitGratuitException extends RuntimeException{
    public ProduitGratuitException(String s){
        super(s);
    }
}
