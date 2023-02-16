package com.exceptionhandling;

public class MainCurrency {
    public static void main(String[] args) {

        CurrencyClassOne currency = new CurrencyClassOne(2000, CurrencyType.DOLLAR);
        currency.tear();
        try {
            currency.validate();
        }catch (CurrencyExceptionOne ce){
            System.out.println(ce.getMessage());
            currency.fix();
            try {
                currency.validate();
            } catch (CurrencyExceptionOne e) {
                e.printStackTrace();
            }
        }
        /*String noAsString = "5g";
        Integer.parseInt(noAsString);
        try {
            int noAsInteger = Integer.parseInt(noAsString);
            System.out.println("After parse");
        } catch (NumberFormatException nfe){
            System.out.println(nfe.getMessage());
        }

        int index=1;
        int [] nos = new int[5];
        if(index >=0 && index < nos.length){
            System.out.println(nos[index]);
        }

        int a = 5;
        int b = 0;
        if(b!=0){
            System.out.println(a/b);
        }*/
    }

}
