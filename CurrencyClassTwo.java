package com.exceptionhandling;

import java.util.List;

public class CurrencyClassTwo {
    private long value;
    private CurrencyType currencyType;
    private boolean isTorn;
    private boolean isFake;

    public long getValue() {
        return value;
    }

    public CurrencyType getCurrencyType() {
        return currencyType;
    }

    public CurrencyClassTwo(long value, CurrencyType currencyType) {
        this.value = value;
        this.currencyType = currencyType;
    }

    public void tear() {
        this.isTorn = true;
    }

    public void fix() {
        this.isTorn = false;
    }

    public void validate() throws CurrencyExceptionOne, InvalidCurrencyException {
        List<Long> validCurrencies = List.of(1l, 2l, 5l);
       // List<Long> validCurrencies = List.of(2000l, 2l, 5l);
        if (!validCurrencies.contains(this.value)) {
            throw new InvalidCurrencyException("It's not a valid note " + this.value);
        }
        if (isTorn && this.value > 100) {
            throw new CurrencyExceptionOne("The currency " + this.value + " " + this.currencyType + " is torn");
        }
    }

}
