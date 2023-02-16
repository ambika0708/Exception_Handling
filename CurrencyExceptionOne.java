package com.exceptionhandling;

public class CurrencyExceptionOne extends Exception {
    // CurrencyExceptionOne is created to throw an exception
    public CurrencyExceptionOne(String message) {
        super(message);
        super.getStackTrace();
    }
}
