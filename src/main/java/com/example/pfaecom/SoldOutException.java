package com.example.pfaecom;

public class SoldOutException extends Exception{
    public SoldOutException(String message){
        super(message);
    }
}
