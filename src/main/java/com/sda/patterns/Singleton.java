package com.sda.patterns;

public class Singleton {

    private static Singleton instance;

    public Singleton() {

    }


    public synchronized static Singleton getInstance(){

        if(instance == null){
            instance = new Singleton();
            System.out.println("Tworzę instancję");
        }
        return instance;
    }
}
