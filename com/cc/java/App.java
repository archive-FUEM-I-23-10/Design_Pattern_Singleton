package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Singleton obj1 = Singleton.getInstance();
        Helper.ausgabe(obj1);
        obj1.actOnEvent();
        obj1.actOnEvent();
       // Events werden kumuliert ... 0 + 2
       Helper.ausgabe(obj1.getCounter());

       Singleton obj2 = Singleton.getInstance();
       Helper.ausgabe(obj2);
       obj2.actOnEvent();
       obj2.actOnEvent();
       obj2.actOnEvent();
        // Events werden kumuliert ... 2 + 3
    	Helper.ausgabe(obj2.getCounter());

        Singleton obj3 = Singleton.getInstance();
        Helper.ausgabe(obj3);
        obj3.actOnEvent();
        obj3.actOnEvent();
        obj3.actOnEvent();
        obj3.actOnEvent();
        obj3.actOnEvent();
        // Events werden kumuliert ... 5 + 5
        Helper.ausgabe(obj3.getCounter());
    }

}
