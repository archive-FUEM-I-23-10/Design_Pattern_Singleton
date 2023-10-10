package com.cc.java;

public class Singleton {
  
    /* Objektbildung */

    private static Singleton instance;
   
    private Singleton(){
        Helper.ausgabe("Hi, I'm there for you!");
    }

    public static Singleton getInstance(){
        if (instance == null) {
          instance = new Singleton();  
        }
        return instance;
    }

    /* Funktionalität */

    private int counter;

    public int getCounter() {
        return counter;
    }

    public void actOnEvent() {
        this.counter ++;
    }

    
}
