package com.backend.productservice1stjan.advices;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
@RestController
public class ExceptionAdvices {
    @ExceptionHandler
    public void handleException(Exception ex){
        System.out.println("handleException-->"+ex.getMessage());
    }
}
