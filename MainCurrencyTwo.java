package com.exceptionhandling;

public class MainCurrencyTwo {
    public static void main(String[] args) throws InvalidCurrencyException {
        CurrencyClassTwo currencyObjectTwo = new CurrencyClassTwo(2000, CurrencyType.INR);
        currencyObjectTwo.tear();
        try {
            currencyObjectTwo.validate();
            float result = currencyObjectTwo.getValue() / 0;
        }
        catch (CurrencyExceptionOne ce){
            System.out.println(ce.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        /*// Basics of Exception Handling
        String noAsString = "5";
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
        } else{
            System.out.println("Can't divide, invalid value for b");
        }
*/    }

}
