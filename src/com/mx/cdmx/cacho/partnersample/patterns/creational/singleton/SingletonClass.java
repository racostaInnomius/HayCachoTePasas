package com.mx.cdmx.cacho.partnersample.patterns.creational.singleton;

public class SingletonClass {

    private static SingletonClass instance;

    //private constructor
    private SingletonClass(){
        if (instance != null){
            throw new RuntimeException("Please use getInstance() method to get an instance.");
        }
    } 

    public synchronized static SingletonClass getInstance(){
    	// if we didn't created a new instance yet, return a new one
        if (instance == null){
        	instance = new SingletonClass();
        }

        return instance;
    }
}