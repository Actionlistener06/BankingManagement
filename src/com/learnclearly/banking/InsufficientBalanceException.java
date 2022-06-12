package com.learnclearly.banking;

public class InsufficientBalanceException extends Exception {

    public String toString(){
        return "Balance not sufficient";
    }


}
