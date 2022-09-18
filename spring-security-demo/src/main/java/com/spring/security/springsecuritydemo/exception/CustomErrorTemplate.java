package com.spring.security.springsecuritydemo.exception;

import java.util.List;

// Add public getters and setters else you will recieve
// Failure in @ExceptionHandler 
// HttpMediaTypeNotAcceptableException: Could not find acceptable representation for @ControllerAdvice
public class CustomErrorTemplate {
    
    private String date;
    private List<String> errorMessage;
    private int errorCode;
    
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public List<String> getErrorMessage() {
        return errorMessage;
    }
    public void setErrorMessage(List<String> errorMessage) {
        this.errorMessage = errorMessage;
    }
    public int getErrorCode() {
        return errorCode;
    }
    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    
}
