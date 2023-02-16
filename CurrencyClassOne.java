package com.exceptionhandling;

public class CurrencyClassOne {
    private long value;
    private CurrencyType currencyType;
    private boolean isTorn;
    private boolean isFake;
    public CurrencyClassOne(long value, CurrencyType currencyType) {
        this.value = value;
        this.currencyType = currencyType;
    }
    public void tear(){
        this.isTorn = true;
    }
    public void fix(){
        this.isTorn = false;
    }
    public void validate() throws CurrencyExceptionOne {
        if(isTorn || isFake){
            throw new CurrencyExceptionOne("The currency " + this.value + " " + this.currencyType+ " is torn");
        }
    }

}
